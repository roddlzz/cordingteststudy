package coding.programmers;

//  문자열 여러 번 뒤집기  todo
//  문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
//  my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Q032 {
  public String solution(String my_string, int[][] queries) {
    String answer = "";
    for (int i = 0; i < queries.length; i++) {
      int s = queries[i][0];
      int e = queries[i][1];

//      String tmp = my_string.substring(s, e+1);

      for (int j =e; j <= s; j--){

      }

    }
    return answer;
  }
}

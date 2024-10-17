package coding.programmers;

//  문자열 여러 번 뒤집기 https://school.programmers.co.kr/learn/courses/30/lessons/181913
//  문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
//  my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
//  입출력 예
//  my_string	queries	result
//  "rermgorpsam"	[[2, 3], [0, 7], [5, 9], [6, 10]]	"programmers"

public class Q032 {
  public String solution(String my_string, int[][] queries) {
    String answer = "";
    String[] strings = new String[my_string.length()];

    for (int i = 0; i < my_string.length(); i++) {
      strings[i] = my_string.charAt(i) + "";
    }

    for (int i = 0; i < queries.length; i++) {
      int start = queries[i][0];
      int end = queries[i][1];

      // 문자열 뒤집기
      while (start < end) {
        String temp = strings[start];
        strings[start] = strings[end];
        strings[end] = temp;
        start++;
        end--;
      }
    }

    for (int i = 0; i < strings.length; i++) {
      answer += strings[i];
    }

    return answer;
  }
}

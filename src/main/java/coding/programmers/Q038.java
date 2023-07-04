package coding.programmers;

//  문자열 뒤집기 피드백 lecture02.exam01 수정완료
//  문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Q038 {
  public String solution(String my_string, int s, int e) {
    char[] my_char = my_string.toCharArray();
    while (s < e) {
      char tmp = my_char[s];
      my_char[s] = my_char[e];
      my_char[e] = tmp;

      s++;
      e--;
    }
    my_string = new String(my_char);
    return my_string;
  }
}

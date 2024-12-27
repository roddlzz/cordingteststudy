package coding.programmers;

//  접미사인지 확인하기 https://school.programmers.co.kr/learn/courses/30/lessons/181908
//  어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
//  문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
public class Q037 {
  public int solution(String my_string, String is_suffix) {
    int n = my_string.length();
    for (int i = 0; i < n; i++) {
      if (is_suffix.equals(my_string.substring(i, n))) {
        return 1;
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    Q037 q = new Q037();
    System.out.println(q.solution("banana", "ana"));
    System.out.println(q.solution("banana", "nan"));
    System.out.println(q.solution("banana", "wxyz"));
    System.out.println(q.solution("banana", "abanana"));
  }
}

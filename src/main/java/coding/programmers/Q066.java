package coding.programmers;

//    접두사인지 확인하기  https://school.programmers.co.kr/learn/courses/30/lessons/181906
//    어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
//    문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
//    입출력 예
//    my_string	is_prefix	result
//    "banana"	"ban"	1
//    "banana"	"nan"	0
//    "banana"	"abcd"	0
//    "banana"	"bananan"	0
public class Q066 {
  public int solution(String my_string, String is_prefix) {
    for (int i = 0; i < my_string.length(); i++) {
      if (my_string.substring(0, i + 1).equals(is_prefix)) {
        return 1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    Q066 q066 = new Q066();
    System.out.println(q066.solution("banana", "ban"));
    System.out.println(q066.solution("banana", "nan"));
    System.out.println(q066.solution("banana", "abcd"));
    System.out.println(q066.solution("banana", "bananan"));
  }
}

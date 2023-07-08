package coding.programmers;

import java.util.Arrays;

//    글자 지우기  https://school.programmers.co.kr/learn/courses/30/lessons/181900 todo
//    문제 설명
//    문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
//
//    입출력 예
//    my_string	indices	result
//    "apporoograpemmemprs"	[1, 16, 6, 15, 0, 10, 11, 3]	"programmers"
public class Q093 {
  public String solution(String my_string, int[] indices) {
    String answer = "";
    for (int i = 0; i < my_string.length(); i++) {
      if (!Arrays.asList(indices).contains(i)) {
        answer = answer + my_string.charAt(i);
      }
    }
    return answer;
  }
}

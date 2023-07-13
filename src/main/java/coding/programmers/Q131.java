package coding.programmers;

//    특정 문자 제거하기  https://school.programmers.co.kr/learn/courses/30/lessons/120826
//    문제 설명
//    문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
//
//    입출력 예
//    my_string	letter	result
//    "abcdef"	"f"	"abcde"
//    "BCBdbe"	"B"	"Cdbe"
public class Q131 {
  public String solution(String my_string, String letter) {
    String answer = "";
    for (int i =0; i < my_string.length(); i++){
      if (String.valueOf(my_string.charAt(i)).equals(letter)){
        answer = answer + String.valueOf(my_string.charAt(i));
      }
    }
    return answer;
  }
}

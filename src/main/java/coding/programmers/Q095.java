package coding.programmers;
//    특정 문자열로 끝나는 가장 긴 부분 문자열 찾기 https://school.programmers.co.kr/learn/courses/30/lessons/181872 todo
//    문제 설명
//    문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
//
//    입출력 예
//    myString	pat	result
//    "AbCdEFG"	"dE"	"AbCdE"
//    "AAAAaaaa"	"a"	"AAAAaaaa"
public class Q095 {
  public String solution(String myString, String pat) {
    String answer = "";
    char[] myChar = myString.toCharArray();
    for (int i = 0 ; i < myString.length(); i++){
      if (myChar.equals(pat)){
        for (int j =0; j < pat.length(); j++){

        }
      }
    }

    return answer;
  }
}

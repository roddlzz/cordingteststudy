package coding.programmers;

//  대문자로 바꾸기
//  알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
public class Q045 {
  public String solution(String myString) {
    String answer = "";
    for (int i = 0; i < myString.length(); i++) {
      answer = myString.toUpperCase();
    }
    return answer;
  }
}

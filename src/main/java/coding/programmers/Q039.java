package coding.programmers;

//  qr code
// 두 정수 q, r과 문자열 code가 주어질 때, code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Q039 {
  public String solution(int q, int r, String code) {
    String answer = "";

    char[] codeChar = code.toCharArray();

    for (int i = 0; i < code.length(); i++) {
      if (i % q == r) {
        answer = answer + codeChar[i];
      }
    }
    return answer;
  }
}

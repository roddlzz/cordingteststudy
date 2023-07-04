package coding.programmers;

//  문자열 섞기
//  길이가 같은 두 문자열 str1과 str2가 주어집니다.
//  두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
public class Q003 {
  public String solution(String str1, String str2) {
    String answer = "";
    char[] char1 = str1.toCharArray();
    char[] char2 = str2.toCharArray();

    for (int i = 0; i < str1.length(); i++) {
        answer = answer + char1[i];
        answer = answer + char2[i];
    }
    return answer;
  }
}

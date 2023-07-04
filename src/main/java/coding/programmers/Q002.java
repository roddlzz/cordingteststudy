package coding.programmers;

//  문자열 겹쳐쓰기
// 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
// 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Q002 {
  public String solution(String my_string, String overwrite_string, int s) {
    char[] myString = my_string.toCharArray();
    char[] overWriteString = overwrite_string.toCharArray();
    for (int i = 0; i < overwrite_string.length(); i++) {
      myString[s + i] = overWriteString[i];
    }
    String answer = new String(myString);
    return answer;
  }
}

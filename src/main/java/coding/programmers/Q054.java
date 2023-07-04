package coding.programmers;

//특정한 문자를 대문자로 바꾸기
//영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때, my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
//    입출력 예
//    my_string	alp	result
//    "programmers"	"p"	"Programmers"
//    "lowercase"	"x"	"lowercase"
public class Q054 {
  public String solution(String my_string, String alp) {
    String answer = "";
    String[] my_Array = my_string.split("");
    for (int i = 0; i < my_string.length(); i++) {
      if (my_Array[i].equals(alp)) {
        my_Array[i] = alp.toUpperCase();
      }
    }
    answer = String.join("", my_Array);
    return answer;
  }
}

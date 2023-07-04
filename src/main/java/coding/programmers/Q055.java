package coding.programmers;

//rny_string
//'m'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
//    입출력 예
//    rny_string	result
//    "masterpiece"	"rnasterpiece"
//    "programmers"	"prograrnrners"
//    "jerry"	"jerry"
//    "burn"	"burn"
public class Q055 {
  public String solution(String rny_string) {
    String answer = "";
    String[] rny_Array = rny_string.split("");
    for (int i = 0; i < rny_Array.length; i++) {
      if (rny_Array[i].equals("m")) {
        rny_Array[i] = "rn";
      }
    }
    answer = String.join("", rny_Array);
    return answer;
  }
}

package coding.programmers;

//  이어 붙인 수 피드백 수정함
//  정수가 담긴 리스트 num_list가 주어집니다.
//  num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
public class Q017 {
  public int solution(int[] num_list) {
    int answer = 0;
    String odd = "";
    String even = "";

    for (int num : num_list) {
      if (num % 2 == 1) {
        odd = odd + Integer.toString(num);
      }else {
        even = even + Integer.toString(num);
      }
    }

    answer = Integer.parseInt(odd)+Integer.parseInt(even);

    return answer;
  }
}

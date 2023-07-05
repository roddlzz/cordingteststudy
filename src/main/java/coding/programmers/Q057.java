package coding.programmers;

//    길이에 따른 연산
//    정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
//    입출력 예
//    num_list	result
//    [3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]	51
//    [2, 3, 4, 5]	120
public class Q057 {
  public int solution(int[] num_list) {
    int answer = 0;
    if (num_list.length >= 11) {
      for (int num : num_list) {
        answer = answer + num;
      }
    } else {
      answer = 1;
      for (int num : num_list) {
        answer = answer * num;
      }
    }
    return answer;
  }
}

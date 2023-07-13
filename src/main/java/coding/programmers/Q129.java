package coding.programmers;

//    짝수 홀수 개수  https://school.programmers.co.kr/learn/courses/30/lessons/120824
//    문제 설명
//    정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
//    입출력 예
//    num_list	result
//    [1, 2, 3, 4, 5]	[2, 3]
//    [1, 3, 5, 7]	[0, 4]
public class Q129 {
  public int[] solution(int[] num_list) {
    int[] answer = new int[2];
    int evenCnt = 0;
    int oddCnt = 0;

    for (int num : num_list){
      if (num % 2 == 0){
        evenCnt++;
      }else {
        oddCnt++;
      }
    }
    answer[0] = evenCnt;
    answer[1] = oddCnt;
    return answer;
  }
}

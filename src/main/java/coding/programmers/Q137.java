package coding.programmers;

//    진료 순서 정하기   https://school.programmers.co.kr/learn/courses/30/lessons/120835
//    문제 설명
//    외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
//    입출력 예
//    emergency	result
//    [3, 76, 24]	[3, 1, 2]
//    [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
//    [30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]
public class Q137 {
  public int[] solution(int[] emergency) {
    int[] answer = {};
    for (int i = 0; i < emergency.length; i++) {
      if (emergency[i] < emergency[i + 1]) {

      }
    }
    return answer;
  }
}

package coding.programmers;

//    카운트 다운 todo
//    문제 설명
//    정수 start와 end가 주어질 때, start에서 end까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//    입출력 예
//    start	end	result
//    10	3	[10, 9, 8, 7, 6, 5, 4, 3]
public class Q062 {
  public int[] solution(int start, int end) {
    int[] answer = new int[start - end + 1];
    for (int i = start; i >= end; i--) {

    }
    return answer;
  }
}

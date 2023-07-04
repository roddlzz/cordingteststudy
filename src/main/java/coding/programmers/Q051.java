package coding.programmers;

import java.util.ArrayList;
import java.util.List;

//  n번째 원소부터
//  정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//입출력 예
//    num_list	n	result
//    [2, 1, 6]	3	[6]
//    [5, 2, 1, 7, 5]	2	[2, 1, 7, 5]
public class Q051 {
  public List solution(int[] num_list, int n) {
    List<Integer> answer = new ArrayList<>();
    for (int i = n - 1; i < num_list.length; i++) {
      answer.add(num_list[i]);
    }
    return answer;
  }
}

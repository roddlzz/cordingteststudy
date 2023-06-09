package coding.programmers;

import java.util.ArrayList;

//    순서 바꾸기  https://school.programmers.co.kr/learn/courses/30/lessons/181891
//    문제 설명
//    정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
//    입출력 예
//    num_list	n	result
//    [2, 1, 6]	1	[1, 6, 2]
//    [5, 2, 1, 7, 5]	3	[7, 5, 5, 2, 1]
public class Q081 {
  public int[] solution(int[] num_list, int n) {
    int[] answer;
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    for (int i = 0; i < num_list.length; i++){
      if (i < n){
        list1.add(num_list[i]);
      }else {
        list2.add(num_list[i]);
      }
    }
    list2.addAll(list1);
    answer = list2.stream().mapToInt(i->i).toArray();
    return answer;
  }
}

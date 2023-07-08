package coding.programmers;

import java.util.ArrayList;

//    배열의 원소 삭제하기 https://school.programmers.co.kr/learn/courses/30/lessons/181844
//    문제 설명
//    정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
//    입출력 예
//    arr	delete_list	result
//    [293, 1000, 395, 678, 94]	[94, 777, 104, 1000, 1, 12]	[293, 395, 678]
//    [110, 66, 439, 785, 1]	[377, 823, 119, 43]	[110, 66, 439, 785, 1]
public class Q084 {
  public int[] solution(int[] arr, int[] delete_list) {
    ArrayList<Integer> arrList = new ArrayList<>();
    ArrayList<Integer> deleteList = new ArrayList<>();

    for (int num : arr) {
      arrList.add(num);
    }
    for (int num2 : delete_list) {
      deleteList.add(num2);
    }
    arrList.removeAll(deleteList);
    return arrList.stream().mapToInt(i->i).toArray();
  }
}

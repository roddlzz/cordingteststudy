package coding.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//  2의 영역 todo 피드백 lecture02.exam02
//  정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
//  단, arr에 2가 없는 경우 [-1]을 return 합니다.
//  입출력 예
//  arr	result
//  [1, 2, 1, 4, 5, 2, 9]	[2, 1, 4, 5, 2]
//  [1, 2, 1]	[2]
//  [1, 1, 1]	[-1]
//  [1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
public class Q041 {
  public int[] solution(int[] arr) {
    int[] answer = {};
    HashMap<Integer, Integer> cnt = new HashMap<>();

//    정수 배열 arr를 hashmap 에 담기
    for (int a : arr) {
      if (cnt.containsKey(a)) {
        Integer value = cnt.get(a);
        cnt.put(a, value + 1);
      } else {
        cnt.put(a, 1);
      }
    }

    int start = 0;
    int end = 0;

//    2 가 들어있는 배열 찾기
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 2) {
        start = i;
      }

      return answer;
    }
    return answer;
//  int[] answer = {};
//
//  int start = -1;
//  int end = 0;
//
//  //  2가 들어있는 값찾기
//    for (int i = 0; i < arr.length; i++) {
//    if (arr[i] == 2) {
//      start = i;
//    }
//    if (start != -1) {
//      for (int j = start; j < arr.length; j++) {
//        if (arr[j] == 2) {
//          end = j;
//        }
//      }
//    }
//  }
//
//  //  배열 List에 담기
//  List<Integer> result = new ArrayList<>();
//    if (start != -1) {
//    for (int i = start; i <= end; i++) {
//      result.add(arr[i]);
//    }
//  } else {
//    result.add(-1);
//  }
//
//  // 배열 List answer 담기
//  answer = new int[result.size()];
//    for (int i = 0; i < result.size(); i++) {
//    answer[i] = result.get(i);
//  }
//
//    return answer;
//}
  }
}


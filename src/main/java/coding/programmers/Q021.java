package coding.programmers;

import java.util.Arrays;

//  수열과 구간 쿼리3
//  정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
//  각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
//  위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
public class Q021 {
  public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[arr.length];
    for (int i=0; i<queries.length; i++){
      int tmp = arr[queries[i][1]];
      arr[queries[i][1]] = arr[queries[i][0]];
      arr[queries[i][0]] = tmp;
    }
    answer = Arrays.copyOf(arr,arr.length);
    return answer;
  }
}

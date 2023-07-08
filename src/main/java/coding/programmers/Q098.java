package coding.programmers;

//    수열과 구간 쿼리 1   https://school.programmers.co.kr/learn/courses/30/lessons/181883
//    문제 설명
//    정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.
//    각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
//    위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
//
//    입출력 예
//    arr	queries	result
//    [0, 1, 2, 3, 4]	[[0, 1],[1, 2],[2, 3]]	[1, 3, 4, 4, 4]
public class Q098 {
  public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[arr.length];
    System.arraycopy(arr, 0, answer, 0, arr.length);

    for (int i = 0; i < queries.length; i++) {
      int s = queries[i][0];
      int e = queries[i][1];

      for (int j = s; j <= e; j++) {
        arr[j] = arr[j] + 1;
        answer[j] = arr[j];
      }
    }
    return answer;
  }
}

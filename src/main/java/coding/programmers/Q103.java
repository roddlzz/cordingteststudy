package coding.programmers;

import java.util.ArrayList;

//    리스트 자르기 https://school.programmers.co.kr/learn/courses/30/lessons/181897
//    문제 설명
//    정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
//    n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
//    n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
//    n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
//    n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
//    올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
//
//    입출력 예
//    n	slicer	num_list	result
//    3	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 3, 4, 5, 6]
//    4	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 4, 6]
public class Q103 {
  public int[] solution(int n, int[] slicer, int[] num_list) {
    ArrayList<Integer> list = new ArrayList<>();

    int a = slicer[0];
    int b = slicer[1];
    int c = slicer[2];
    int len = num_list.length;

    switch (n) {
      case 1:
        for (int i = 0; i <= b; i++) {
          list.add(num_list[i]);
        }
        break;
      case 2:
        for (int i = a; i < len; i++) {
          list.add(num_list[i]);
        }
        break;
      case 3:
        for (int i = a; i <= b; i++) {
          list.add(num_list[i]);
        }
        break;
      case 4:
        for (int i = a; i <= b; i = i + c) {
          list.add(num_list[i]);
        }
        break;
    }

    return list.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {
    Q103 solution = new Q103();
    System.out.println(solution.solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
  }
}

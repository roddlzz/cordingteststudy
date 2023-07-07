package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q081Test {

  @Test
  void solution() {
    Q081 test = new Q081();
    int[] num_list = {2, 1, 6};
    int[] result = {1, 6, 2};
    assertArrayEquals(result,test.solution(num_list,1));

    int[] num_list2 = {5, 2, 1, 7, 5};
    int[] result2 = {7, 5, 5, 2, 1};
    assertArrayEquals(result2,test.solution(num_list2,3));
  }
}
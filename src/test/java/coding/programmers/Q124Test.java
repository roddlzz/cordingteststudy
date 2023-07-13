package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q124Test {

  @Test
  void solution() {
    Q124 test = new Q124();
    int[] num_list = {1, 2, 3, 4, 5};
    int[] result = {5, 4, 3, 2, 1};
    assertArrayEquals(result, test.solution(num_list));
  }
}
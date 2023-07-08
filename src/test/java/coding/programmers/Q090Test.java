package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q090Test {

  @Test
  void solution() {
    Q090 test = new Q090();
    int[] arr = {0, 0, 0, 1};
    assertEquals(3, test.solution(arr,1));
    int[] arr2 = {1, 0, 0, 1, 0, 0};
    assertEquals(-1, test.solution(arr2,4));
    int[] arr3 = {1, 1, 1, 1, 0};
    assertEquals(3, test.solution(arr3,3));
  }
}
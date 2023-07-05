package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q067Test {

  @Test
  void solution() {
    Q067 test = new Q067();
    int[] exp = {4, 6, 7};
    int[] arr = {4, 2, 6, 1, 7, 6};
    assertArrayEquals(exp, test.solution(arr,2));
  }
}
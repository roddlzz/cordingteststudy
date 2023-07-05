package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q069Test {

  @Test
  void solution() {
    Q069 test = new Q069();
    int[] exp = {3, 6, 9};
    assertArrayEquals(exp, test.solution(10,3));
  }
}
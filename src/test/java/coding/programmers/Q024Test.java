package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q024Test {

  Q024 test = new Q024();

  @Test
  void solution() {
    int[] exp = {5, 50, 55};
    assertArrayEquals(exp, test.solution(5,55));
    int[] exp2 = {-1};
    assertArrayEquals(exp2, test.solution(10,20));
  }
}
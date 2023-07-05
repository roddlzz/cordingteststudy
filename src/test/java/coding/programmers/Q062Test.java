package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q062Test {

  @Test
  void solution() {
  Q062 test = new Q062();
  int[] result = {10, 9, 8, 7, 6, 5, 4, 3};

  assertArrayEquals(result, test.solution(10,3));
  }
}
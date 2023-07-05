package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q068Test {

  @Test
  void solution() {
    Q068 test = new Q068();

    assertEquals(1, test.solution("AbCdEfG","BcD"));
  }
}
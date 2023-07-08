package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q107Test {

  @Test
  void solution() {
    Q107 test = new Q107();
    assertEquals("1316",test.solution("582","734"));
//    assertEquals("305793246910280479981",test.solution("18446744073709551615","287346502836570928366"));
    assertEquals("0",test.solution("0","0"));
  }
}
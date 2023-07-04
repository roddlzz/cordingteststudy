package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q063Test {
  Q063 test = new Q063();

  @Test
  void test(){
    assertEquals(34,test.solution(3,5));
    assertEquals(14,test.solution(6,1));
    assertEquals(2,test.solution(2,4));
  }

}
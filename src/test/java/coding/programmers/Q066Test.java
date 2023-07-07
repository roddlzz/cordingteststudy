package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q066Test {

  @Test
  void solution() {
    Q066 test= new Q066();
    assertEquals(1,test.solution("banana","ban"));
//    assertEquals(0,test.solution("banana","nan"));
//    assertEquals(0,test.solution("banana","abcd"));
//    assertEquals(0,test.solution("banana","bananan"));
  }
}
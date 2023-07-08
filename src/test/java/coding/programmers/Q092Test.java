package coding.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q092Test {

  @Test
  void solution() {
    Q092 test = new Q092();
    int[] date1 = {2021, 12, 28};
    int[] date2 = {2021, 12, 29};
//    assertEquals(1, test.solution(date1, date2));

    int[] date3 = {2022, 12, 28};
    int[] date4 = {2022, 12, 28};
    assertEquals(0, test.solution(date3, date4));

//    int[] date5 = {2021, 12, 28};
//    int[] date6 = {2020, 12, 29};
//    assertEquals(0, test.solution(date5, date6));
  }
}
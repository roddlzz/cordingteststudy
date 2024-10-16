package coding.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//  주사위게임3 https://school.programmers.co.kr/learn/courses/30/lessons/181916
//  1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
//  네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//  세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
//  주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//  어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
//  네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
//  네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
//       * 입출력 예
//       * a	b	c	d	result
//       * 2	2	2	2	2222
//       * 4	1	4	4	1681
//       * 6	3	3	6	27
//       * 2	5	2	6	30
//       * 6	4	2	5	2
public class Q029 {
  public int solution(int a, int b, int c, int d) {
    int[] numbers = {a, b, c, d};

    // 키 = number, 값 = number count
    Map<Integer, Integer> numberCountmap = new HashMap<>();

    for (int number : numbers) {
      numberCountmap.put(number, numberCountmap.getOrDefault(number, 0) + 1);
    }

    int p = 0;
    int q = 0;
    int r = 0;

    // 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점
    if (numberCountmap.size() == 1) {
      return 1111 * a;
    }

    if (numberCountmap.size() == 2) {
      // 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
      if (numberCountmap.containsValue(3)) {
        for (Map.Entry<Integer, Integer> entry : numberCountmap.entrySet()) {
          if (entry.getValue() == 3) {
            p = entry.getKey();
          } else {
            q = entry.getKey();
          }
        }
        return (10 * p + q) * (10 * p + q);
      }

      // 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
      if (numberCountmap.containsValue(2)) {
        int[] keys = new int[2];
        int index = 0;
        for (int key : numberCountmap.keySet()) {
          keys[index++] = key;
        }
        p = keys[0];
        q = keys[1];
        return (p + q) * Math.abs(p - q);
      }
    }

    // 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점
    if (numberCountmap.size() == 3) {
      for (Map.Entry<Integer, Integer> entry : numberCountmap.entrySet()) {
        if (entry.getValue() == 2) {
          p = entry.getKey();
        } else if (q == 0) {
          q = entry.getKey();
        } else {
          r = entry.getKey();
        }
      }
      return q * r;
    }

    // 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수
    Arrays.sort(numbers);
    return numbers[0];
  }
}



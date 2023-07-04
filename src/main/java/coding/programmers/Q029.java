package coding.programmers;

import java.util.HashMap;

//  주사위게임3 Todo 피드백7 받았는데 다시 질문
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
    int answer = 0;
    HashMap<Integer, Integer> cnt = new HashMap<>();
    int[] keyArray = {a, b, c, d};

//    key의 값이 있으면 count +1 해서 같은 값이 있는 key의 count를 담음
    for (int key : keyArray) {
      if (cnt.containsKey(key)) {
        Integer value = cnt.get(key);
        cnt.put(key, value + 1);
      } else {
        cnt.put(key, 1);
      }
    }

//    모든 값이 같은 주사위일때
    if (cnt.size() == 1) {
      answer = 1111 * a;

//    주사위 값이 두가지가 있을 경우
    } else if (cnt.size() == 2) {
//    1. 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//    2. 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)제곱 점
      int p = 0;
      int q = 0;
//      1번 경우
      for (int key : cnt.keySet()) {
        if (cnt.get(key) == 2) {
          p = key;
        } else {
          q = key;
        }
      }
//      2번 경우
      if (cnt.get(p) == 3) {
        answer = (10 * p + q) * (10 * p + q);
      } else {
        answer = (p + q) * (p - q);
      }

//      주사위 값이 3개 있을 때
    } else if (cnt.size() == 3) {
//      어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을
      int p = 0;
      int q = 0;
      int r = 0;

      for (int key : cnt.keySet()) {
        if (cnt.get(key) == 2) {
          p = key;
        } else if (q == 0) {
          q = key;
        } else {
          r = key;
        }
      }
      answer = q * r;

//      모두 다른 값일때
    } else {
      int min = a;
      if (b < a) {
        min = b;
      } else if (c < b) {
        min = c;
      } else if (d < c) {
        min = d;
      }
      answer = min;
    }

    return answer;
  }
}



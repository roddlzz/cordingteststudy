package coding.programmers;

//  배열 만들기5   https://school.programmers.co.kr/learn/courses/30/lessons/181912
//  문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
//  배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다. 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
//  입출력 예
//  intStrs	k	s	l	result
//  ["0123456789","9876543210","9999999999999"]	50000	5	5	[56789, 99999]

import java.util.ArrayList;
import java.util.List;

public class Q033 {
  public int[] solution(String[] intStrs, int k, int s, int l) {
    List<Integer> result = new ArrayList<>();

    int end = Math.min(s + l, intStrs.length);

    for (String str : intStrs) {
      for (int i = s; i < end; i++) {
      }
    }
    return result.stream().mapToInt(i -> i).toArray();
  }
}

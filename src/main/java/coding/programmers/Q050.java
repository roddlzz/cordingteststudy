package coding.programmers;

import java.util.HashMap;

//  문자열 정수의 합 lecture02.exam03
//  한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
public class Q050 {
  public int solution(String num_str) {
    int answer = 0;
    String[] array = num_str.split("");
    int[] num = new int[num_str.length()];
    for (int i = 0; i < num.length; i++) {
      num[i] = Integer.parseInt(array[i]);
    }
    for (int sum : num) {
      answer = answer + sum;
    }
    return answer;
  }
}

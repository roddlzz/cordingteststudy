package coding.programmers;

//    배열의 평균값 https://school.programmers.co.kr/learn/courses/30/lessons/120817
//    문제 설명
//    정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
//
//    입출력 예
//    numbers	result
//    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	5.5
//    [89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	94.0
public class Q120 {
  public double solution(int[] numbers) {
    double answer = 0;
    for (int num : numbers){
      answer = answer + (double)num / numbers.length;
    }
    return answer;
  }
}

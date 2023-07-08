package coding.programmers;

//    두 수의 합  https://school.programmers.co.kr/learn/courses/30/lessons/181846 todo 질문
//    문제 설명
//    0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
//
//    입출력 예
//    a	b	result
//    "582"	"734"	"1316"
//    "18446744073709551615"	"287346502836570928366"	"305793246910280479981"
//    "0"	"0"	"0"
public class Q107 {
  public String solution(String a, String b) {
    Long num1 = Long.parseLong(a);
    Long num2 = Long.parseLong(b);
    Long answer = num1 + num2;
    return String.valueOf(answer);
  }
}

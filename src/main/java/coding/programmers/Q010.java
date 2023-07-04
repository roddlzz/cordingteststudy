package coding.programmers;

//  홀짝에 따라 다른 값 반환하기 피드백 받고 수정함
//  양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
public class Q010 {
  public int solution(int n) {
    int answer = 0;
    if (n % 2 == 1) {
      for (int i = 0; i <= n; i++) {
        if (i % 2 == 1) {
          answer = answer + i;
        }
      }
    } else {
      for (int i = 0; i <= n; i++) {
        if (i % 2 == 0) {
          answer = answer + (i * i);
        }
      }
    }
    return answer;
  }
}

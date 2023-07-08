package coding.programmers;

import java.util.ArrayList;

//    ad 제거하기 https://school.programmers.co.kr/learn/courses/30/lessons/181870
//    문제 설명
//    문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
//    입출력 예
//    strArr	result
//    ["and","notad","abcd"]	["and","abcd"]
//    ["there","are","no","a","ds"]	["there","are","no","a","ds"]
public class Q089 {
  public String[] solution(String[] strArr) {
    ArrayList<String> strList = new ArrayList<>();
    for (String str : strArr) {
      if (!str.contains("ad")) {
        strList.add(str);
      }
    }
    return strList.toArray(new String[0]);
  }
}

package com.eomcs.oop.ex00.util;

public class Calculator {
  //인스턴스 메서드는 유효한 인스턴스 주소 없이 호출할 수 없다.

  //1) plus,minus...를 calculator class로 따로 분류

  public int result = 0; //4) 붙여넣기 + static
  //5) 4-> 리턴 안해도 됨. 같은 클래스 내에 저장할거기 떄문-> 아래에 void붙여주기

  public void plus(Calculator that, int value) {  //2) 내용물 잘라와서 블록 안에 넣기
    this.result += value;
  }

  public void minus(Calculator that,int value) {
    this.result -= value;
  }

  public void multiple(Calculator that, int value) {
    this.result *= value;
  }

  public void divide(Calculator that, int value) {
    this.result /= value;
  }

  static int abs(int value) {  
    // 인스턴스 변수 혹은 인스턴트 메서드를 쓰지 않는 메서드는 그냥 static으로 생성하면 됨
    // 주어진 파라미터를 가지고 계산하고 끝내는 것이기 때문
    return value > 0 ? value : -value;
  }

}

package com.eomcs.oop.ex00;

public class Test {
  static int a; // 딱 한번 만들어짐. 클래스 로딩시
  int b;// new라는 명령어를 줘야 만들어짐

  void m(int c) {
    int d = c + 100;
  }
}

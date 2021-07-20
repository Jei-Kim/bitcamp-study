package com.eomcs.oop.ex00;

import com.eomcs.oop.ex00.util.Calculator;

public class Exam0500 {

  public static void main(String[] args) {
    // 2 + 3 - 1 * 7 / 3 = ?

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(2); 
    c2.plus(3); 
    // 3)클래스가 분리되었기 때문에 plus 앞에 calculator.로 클래스 소속을 밝혀줘야 함

    c1.plus(3); 
    c2.multiple(2);

    c1.minus(1);
    c1.plus(7); 

    c1.multiple(7);
    c2.divide(4);
    c1.divide(3);
    c2.minus(5);

    System.out.printf("result = %d\n", c1.result);
    System.out.printf("result = %d\n", c2.result);
  }


}


// 210-280
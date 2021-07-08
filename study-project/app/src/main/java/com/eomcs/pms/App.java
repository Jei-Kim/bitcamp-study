package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

//1) 배열 사용 전
//2) 배열 사용 후
//3) 반복문 사용: while
//4) 반복문 사용: for
//5) 여러 문장에서 반복해서 사용하는 값은 변수에 담아서 사용한다.
//6) 조회용으로만 사용할 변수라면 상수로 선언한다.
//7) 특정 조건에 따라 반복을 멈춘다.

public class App {

  public static void main(String[] args) {

    System.out.println("[회원]"); 

    final int   MAX_LANGTH = 100;

    int[] no = new int[MAX_LANGTH];
    String[] name = new String[MAX_LANGTH];
    String[] email = new String[MAX_LANGTH];
    String[] password = new String[MAX_LANGTH];
    String[] photo = new String[MAX_LANGTH];
    String[] tel = new String[MAX_LANGTH];

    Scanner keyboardScan = new Scanner(System.in);

    int size = 0;

    for (int = 0; i < MAX_LANGTH; i = i + 1) {
      size = size + 1
          System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());
      System.out.print("이름? ");
      name[i] = keyboardScan.nextLine();
      System.out.print("이메일? ");
      email[i] = keyboardScan.nextLine();
      System.out.print("암호? ");
      password[i] = keyboardScan.nextLine();
      System.out.print("사진? ");
      photo[i] = keyboardScan.nextLine();
      System.out.print("전화? ");
      tel[i] = keyboardScan.nextLine();
      registeredDate[i] = new Date();
      System.out.println();
    }

    System.out.println("계속 입력하시겠습니까? (y/N)");
    String input = keyboardScan.nextLine();
    if (input.equals("N")) {
      break;
    }

    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

    System.out.println("-----------------------------------------");

    for (int i = 0; i < size; i = i + 1) {

      System.out.println("번호:" + no[i]);
      System.out.println("이름:" + name[i]);
      System.out.println("이메일:" + email[i]);
      System.out.printf("암호: %s\n", password[i]);
      System.out.printf("사진: %s\n", photo[i]);
      System.out.printf("전화: %s\n", tel[i]);
      System.out.printf("가입일: %s\n", registeredDate[i]);
      System.out.println();

    }

  }
}
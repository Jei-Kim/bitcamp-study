package com.eomcs.pms;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");

    Scanner keyboardScan = new Scanner(System.in);
    //scanner란 키보드에서 사용자가 입력한 값을 읽어서
    // 문자열이나 정수, 부동소수점 등으로 리턴하는 역할

    System.out.print("번호? ");
    String no = keyboardScan.nextLine();

    System.out.print("이름? ");
    String name = keyboardScan.nextLine();

    System.out.print("이메일? ");
    String email = keyboardScan.nextLine();

    System.out.print("암호? ");
    String password = keyboardScan.nextLine();

    System.out.print("사진? ");
    String photo = keyboardScan.nextLine();

    System.out.print("전화? ");
    String tel = keyboardScan.nextLine();

    java.sql.Date now = new java.sql.Date(System.currentTimeMillis());
    //System.currentTimeMills()는 1970년~ 지금까지 경과된 시간을 보여줌.
    // new java.sql.date(밀리초)
    //- 넘겨 받은 밀리초를 가지고 년,월,일,시,분,초를 계산함

    keyboardScan.close();

    System.out.println("-----------------------------------------");

    System.out.println("번호:" + no);
    System.out.println("이름:" + name);
    System.out.println("이메일:" + email);
    System.out.printf("암호: %s\n", password);
    System.out.printf("사진: %s\n", photo);
    System.out.printf("전화: %s\n", tel);
    System.out.printf("가입일: %s\n", now);
  }
}
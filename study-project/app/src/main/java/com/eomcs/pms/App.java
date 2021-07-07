package com.eomcs.pms;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    System.out.println("[회원]");
    Scanner keyboardScan = new Scanner(System.in);

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

    keyboardScan.close();

    System.out.println("-------------------------------");

    System.out.println(no);
    System.out.println(name);
    System.out.println(email);
    System.out.println(password);
    System.out.println(photo);
    System.out.println(tel);
    System.out.println(now);

  }
}

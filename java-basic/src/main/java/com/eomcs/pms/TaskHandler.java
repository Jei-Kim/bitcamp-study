package com.eomcs.pms;

import java.sql.Date;
import com.eomcs.pms.util.Prompt;

public class TaskHandler {

  // 작업 정보
  static final int TASK_LENGTH = 100;
  static int[] No = new int[TASK_LENGTH];
  static String[] Content = new String[TASK_LENGTH];
  static Date[] Deadline = new Date[TASK_LENGTH];
  static String[] Owner = new String[TASK_LENGTH];
  static int[] Status = new int[TASK_LENGTH];
  static int Size = 0;

  static void add() {
    System.out.println("[작업 등록]");

    No[Size] = Prompt.inputInt("번호? ");
    Content[Size] = Prompt.inputString("내용? ");
    Deadline[Size] = Prompt.inputDate("마감일? ");

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    Status[Size] = Prompt.inputInt("> ");
    Owner[Size] = Prompt.inputString("담당자? ");

    Size++;
  }

  static void list() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < Size; i++) {
      String stateLabel = null;
      switch (Status[i]) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }

      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          No[i], Content[i], Deadline[i], stateLabel, Owner[i]);
    }
  }
}


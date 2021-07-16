package com.eomcs.pms;

import java.sql.Date;
import com.eomcs.pms.util.Prompt;

public class ProjectHandler {

  //프로젝트 정보
  static final int PROJECT_LENGTH = 1000;
  static int[] No = new int[PROJECT_LENGTH];
  static String[] Title = new String[PROJECT_LENGTH];
  static String[] Content = new String[PROJECT_LENGTH];
  static Date[] StartDate = new Date[PROJECT_LENGTH];
  static Date[] EndDate = new Date[PROJECT_LENGTH];
  static String[] Owner = new String[PROJECT_LENGTH];
  static String[] Members = new String[PROJECT_LENGTH];
  static int Size = 0;

  static void add() {
    System.out.println("[프로젝트 등록]");

    No[Size] = Prompt.inputInt("번호? ");
    Title[Size] = Prompt.inputString("프로젝트명? ");
    Content[Size] = Prompt.inputString("내용? ");
    StartDate[Size] = Prompt.inputDate("시작일? ");
    EndDate[Size] = Prompt.inputDate("종료일? ");
    Owner[Size] = Prompt.inputString("만든이? ");
    Members[Size] = Prompt.inputString("팀원? ");

    Size++;
  }

  static void list() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < Size; i++) {
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          No[i], Title[i], StartDate[i], EndDate[i], Owner[i]);
    }
  }
}

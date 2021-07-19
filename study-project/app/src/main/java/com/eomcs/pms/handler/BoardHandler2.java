package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler2 {

  static final int MAX_LENGTH = 5;
  static Board[] boards = new Board[MAX_LENGTH];
  static int size = 0;

  // 다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.
  public static void add() {
    System.out.println("[새 게시글]");

    Board board = new Board();

    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.name = Prompt.inputString("작성자? ");

    boards[size++] = board;
  }

  //다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.
  public static void list() {
    System.out.println("[게시글 목록]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%s, %s, %d, %d\n", 
          members[i].no,
          members[i].title, 
          members[i].name, 
          members[i].registeredDate,  
          members[i].content);
    }
  }
}

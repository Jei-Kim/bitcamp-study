package com.eomcs.pms.handler;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {

  static final int MAX_LENGTH = 5;
  static Board[] boards = new Board[MAX_LENGTH];
  static int size = 0;

  // 다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.
  public static void add() {
    System.out.println("[새 게시글2]");

    Board board = new Board();

    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.writer = Prompt.inputString("작성자? ");
    board.registeredDate = Prompt.inputString("등록일? ");
    board.viewCount = Prompt.inputInt("조회수? ");
    board.like = Prompt.inputInt("좋아요 수 ");

    boards[size++] = board;
  }

  //다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.
  public static void list() {
    System.out.println("[게시글 목록]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %d, %d\n", 
          boards[i].no,
          boards[i].title, 
          boards[i].writer, 
          boards[i].registeredDate,  
          boards[i].viewCount,
          boards[i].like);
    }
  }
}

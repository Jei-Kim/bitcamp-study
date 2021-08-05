package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;

public class BoardList extends ArrayList{

  public Board findByNo(int no) {// 모든 xxxlist에서 no로 찾지는 않으니까 걍 여기에 두고 수정해줌
    Objext[] arr = toArray();
    for (Object obj : arr) {
      
      }
    }
    return null;
  }

  

    for (int i = index + 1; i < this.size; i++) {
      this.boards[i - 1] = this.boards[i];
    }
    this.boards[--this.size] = null;

    return true;
  }

  
}









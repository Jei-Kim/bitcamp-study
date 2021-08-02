package com.eomcs.pms.menu;
//MenuItem과 MenuGroup을 같은 타입으로 묶기 위해 정의한 클래스
// 이 클래스 자체는 상속해주는 용도이기 때문에 추상 클래스로 정의한다.
public class Menu {

  // 서브 클래스에서 해야할 일을 정의한다.
  // 단, 서브클래스에서 반드시 재정의할 메서드이기 때문에
  // 구체적으로 구현하지 않는다.

  public abstract void execute();


}

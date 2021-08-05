package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;

public class BoardList {
  static class Node {
    Board board;
    Node next;

    public Node(Board board) {
      this.board = board;
    }
  }
  
  Node head;
  Node tail;
  int size = 0;
  
  public void add(Board board) {
 // 새 노드를 만든다. 생성자를 호출할 때, 노드에 담을 Board 객체 주소를 넘긴다. 
    Node node = new Node(board);

    if (head == null) {
      tail = head = node;
    } else {
      // 기존에 tail이 가리키는 마지막 노드의 next 변수에 새 노드 주소를 저장한다.
      tail.next = node;

      // 새로 만든 노드를 마지막 노드로 설정한다. 
      tail = node;
    }

    size++;
  }

  public Board[] toArray() {
    // 배열에 저장된 값을 담을 정도의 크기를 가진 새 배열을 만든다.
    
    Board[] arr = new Board[this.size];

    Node node = head;
    
    for(int i = 0; i < this.size; i++) {
      arr[i] = node.boars;
      node = node.next;
//    int i = 0;
//    while (node != null) { //node안에 board 객체가 들어 있다면 
//      arr[i++] = node.board;//node에 담긴 board 객체를 arr에 담고, arr는 하나 증가시킴
//      node = node.next; // 다음 node 주소를 현재 node에 담아
  }
  return arr; //node가 null일 경우 = 마지막 노드일 경우, 끝 
  }

  public Board findByNo(int no) {
    Node node = head;
    while( node != null) {
      if(node.board.no == no) {
        return node.board;
          }
      node = node.next;
    }
    return null;
  }

  public boolean remove(Board board) {
    Node node = head;
    Node prev = null;

    while (node != null) {
      if (node.board == board) { //노드에 들어있는 객체와 같다면
        if (node == head) { // 삭제할 노드가 하필 첫 번째 노드라면,
          head = node.next; // head가 두 번째 노드를 가리키게 한다.
        } else { // 삭제할 노드가 첫 번째 노드가 아니라면
          prev.next = node.next; // 이전 노드를 다음 노드와 연결한다.
        }

        node.next = null; // 삭제할 노드가 더이상 다음 노드를 가리키지 않게 한다

        if (node == tail) { // 삭제할 노드가 마지막 노드라면
          tail = prev; // tail이 이전 노드를 가리키게 한다.
        }
        size --; // 삭제 후 사이즈 줄이기
        return true;
      }

      // 현재 노드가 아니라면,
      prev = node; // 현재 노드를 prev에 저장하고,
      node = node.next; // node는 다음 노드를 가리킨다.
    }
    
    return false; //반복문이 끝날때까지 못 찾았다면 false 값을 리턴한다.

  }
}









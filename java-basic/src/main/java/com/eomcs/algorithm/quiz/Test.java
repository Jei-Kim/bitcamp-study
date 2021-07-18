package com.eomcs.algorithm.quiz;

public class Test {

  static void changeValuePosition(int[] values) {
    int tmp;
    for (int i = 0; i < values.length / 2; i++) {
      tmp = values[i + values.length / 2];
      values[i] = values[i + values.length / 2];
      values[i + values.length / 2] = tmp;
    }
  }

  public static void main(String [] args) {
    int[] values = {2, 4, 5, 6, 4, 3, 7, 8};
    changeValuePosition(values);

    for(int v : values) {
      System.out.print(v + ",");
    }

  }
}

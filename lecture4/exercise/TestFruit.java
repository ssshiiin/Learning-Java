package exercise;

import exercise.fruit.*;

public class TestFruit {
  public static void main(String[] args){
    Durian durian = new Durian();
    Orange orange = new Orange();
    Apple apple = new Apple();

    durian.peel();
    orange.peel();
    apple.peel();

    System.out.println("durian: " + durian.getState());
    System.out.println("orange: " + orange.getState());
    System.out.println("apple: " + apple.getState());
  }
}

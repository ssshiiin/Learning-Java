package exercise;

import exercise.fruit.Orange;

public class TestOrange {
  public static void main(String[] args){
    Orange orange1 = new Orange();
    Orange orange2 = new Orange();  
  
    orange1.cut();
    orange1.cut();
    orange1.cut();
    
    orange2.cut();
    orange2.cut();

    System.out.println("Orange1: " + orange1.getPieceNumber());
    System.out.println("Orange2: " + orange2.getPieceNumber());
  }
}

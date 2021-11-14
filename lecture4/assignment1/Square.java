package assignment1;

import assignment1.Rectangle;

public class Square extends Rectangle{
  public Square(int length){  
    super(length, length);
  }

  public void draw(){
    StringBuffer sb = new StringBuffer();
    for (int h = super.height; h > 0; h--){
      for (int w = super.height ;w > 0; w--){
        sb.append("*");
      }
      sb.append("\n");
    }

    System.out.printf(sb.toString());
  }
}

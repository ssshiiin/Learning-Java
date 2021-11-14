package assignment1;

import assignment1.Figure;

public class Rectangle extends Figure{
  public final int width;
  
  public Rectangle (int height, int width){
    super(height);
    this.width = width;
  }

  public void draw(){
    StringBuffer sb = new StringBuffer();
    for (int h = super.height; h > 0; h--){
      for (int w = this.width ;w > 0; w--){
        sb.append("*");
      }
      sb.append("\n");
    }

    System.out.printf(sb.toString());
  }
}

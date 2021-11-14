package assignment1.figures;

import assignment1.base.Figure;

public class Pyramid extends Figure{
  public Pyramid (int height){
    super(height);
  }

  public void draw(){
    StringBuffer sb = new StringBuffer();
    for (int s = super.height; s > 0; s--){
      for (int t = s - 1 ;t > 0; t--){
        sb.append(" ");      
      }
      for (int l = (2*(super.height - s + 1) - 1) ;l > 0; l--){
        sb.append("*");      
      }
      sb.append("\n");      
    }

    System.out.printf(sb.toString());
  }
}

package assignment1.base;

public class Figure {
  protected int height;

  public Figure(int height){
    this.height = height;
  }

  public void draw(){
    StringBuffer sb = new StringBuffer();
    sb.append("\n");

    System.out.printf(sb.toString());
  }
}

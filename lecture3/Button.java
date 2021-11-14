public class Button {
  public final String label;
  protected Boolean pressed;
  public static int numPressed = 0;

  public Button () {
    this.label = "Untitled";
    this.pressed = false;
  }
  
  public Button (String label) {
    this.label = label;
    this.pressed = false;
  }

  public void press(){
    this.pressed = true;
    numPressed++;
  }
  
  public void release(){
    this.pressed = false;
    numPressed++;
  }

  public Boolean isPressed(){
    return this.pressed;
  }

  public static int getNumPressed(){
    return numPressed;
  }
}

package exercise.asignment2;

public class Animal {
  protected String stomach;

  public String getStomach(){
    return this.stomach;
  }

  public void eat(){
    this.stomach = "full";
  }

  public void run(){
    this.stomach = "hungry";
  }
}

package exercise.fruit;

public class Fruit {
  protected String state = "skined";
  protected int pieceNumber = 1;

  public void peel(){
    this.state = "peeled";
  }

  public String getState(){
    return this.state;
  }

  public int getPieceNumber(){
    return this.pieceNumber;
  }

  public final void cut(){
    this.pieceNumber = this.pieceNumber * 2;
  }
}

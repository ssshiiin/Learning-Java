import java.io.File;
import java.io.FileWriter;
import java.lang.UnsupportedOperationException;

public class MyLogger{
  protected String fileName;
  protected FileWriter fileWriter;
  protected int countWrite;
  protected static int countInstance = 0;

  public MyLogger(String fileName){
    try {
      if(countInstance > 2) {
        throw new UnsupportedOperationException("これ以上インスタンスは作れません");
      }
      this.fileName = fileName;
      countInstance++;
    } catch (UnsupportedOperationException ex) {  
      System.out.println("failed instance");
    }
  }
  
  public void open(){
    try {
      File file = new File(this.fileName);
      this.fileWriter = new FileWriter(file);
    } catch (Exception ex) {
      System.out.println("failed open");
    }
  }
  
  public void write(String str){
    try {
      this.fileWriter.write(str);
      this.fileWriter.write('\n');
      this.fileWriter.write('\n');
      this.countWrite++;
    } catch (Exception e){
      System.out.println("failed write");
    }
  }
  
  public void close(){
    try{
      this.fileWriter.close();
    } catch (Exception ex){
      System.out.println("failed close");
    }
  }
  public int count(){
    return this.countWrite;
  }



}

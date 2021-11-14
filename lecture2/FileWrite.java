import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
  public static void main(String[] args) {
    try {
      File file = new File("./Practice/sample.txt");
      FileWriter fileWriter = new FileWriter(file);

      fileWriter.write("Hello INIAD");
      fileWriter.close();
    } catch (IOException e) {
      System.out.println("err");
    }
  }
}

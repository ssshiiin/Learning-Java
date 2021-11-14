import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputSample {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      StringBuffer stringBuffer = new StringBuffer();
      File file = new File("./Practice/inputText.txt");
      FileWriter fileWriter = new FileWriter(file);

      
      for (;;) {
        String str = scanner.nextLine();
        if (str.length() != 0) {
          stringBuffer.append(str);
          stringBuffer.append('\n');
          continue;
        } else {
          int len = stringBuffer.length();
          stringBuffer.delete(len-1, len);
          String result = stringBuffer.substring(0);
          fileWriter.write(result);
          break;
        }
      }
      fileWriter.close();
    } catch (IOException e) {
      System.out.println("file error");
    }
  }
}

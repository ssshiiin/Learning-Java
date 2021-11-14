import java.io.File;

public class CreateFolder {
  public static void main(String[] args) {
    File newFolder = new File("./Practice");

    if (newFolder.mkdir()) {
      System.out.println("succeeded");
    } else {
      System.out.println("failed");
    }

  }
}

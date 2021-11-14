package assignment1.figures;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import assignment1.base.Writable;

public class WritablePyramid extends Pyramid implements Writable {
  public WritablePyramid(int height){
    super(height);
  }

  @Override
  public void write(String filename){
    try {
      ByteArrayOutputStream bos = new ByteArrayOutputStream();

      PrintStream stdout = System.out;
      PrintStream ps = new PrintStream(bos);
      File file = new File("./test/" + filename);
      FileWriter fileWriter = new FileWriter(file);

      System.setOut(ps);
      super.draw();
      System.setOut(stdout);

      fileWriter.write(bos.toString());
      fileWriter.close();
    } catch (IOException e) {
      System.out.println("err");
    }
  }
}

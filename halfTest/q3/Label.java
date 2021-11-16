package q3;

import java.util.Formatter;

public class Label {
  public static String HEADER = "--- INIAD ---\n";
  protected int id;
  protected String name;
  protected static int count = 0;

  public Label (String name) {
    this.name = name;
    count++;
    this.id = count;
  }

  public String getDisplay() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(HEADER);
    Formatter fm = new Formatter();
    fm.format("[%d] %s", id, name);
    stringBuffer.append(fm);
    return stringBuffer.toString();
  }

}

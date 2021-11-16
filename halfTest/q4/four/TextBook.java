package q4.four;

import java.util.Formatter;

public final class TextBook extends Book{
  protected String subject;

  public TextBook(String title, String subject, int price) {
    super(title, price);
    this.subject = subject;
  }

  @Override
  public String getTitle() {
    return this.subject + ";" + super.getTitle();
  }
}

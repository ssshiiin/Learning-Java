package sample1.pkg2;

import sample1.pkg1.Member;

public class Teacher extends Member{
  public String title;

  public Teacher(String id, String name, String title) {
    super(id, name);
    this.title = title;
  }

  @Override
  public String getProfile(){
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("----- teacher -----").append("\n");
    stringBuffer.append(super.getProfile());
    stringBuffer.append("Title : ").append(this.title).append("\n");

    return stringBuffer.toString();
  }
}

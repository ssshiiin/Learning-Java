package assignment2.pkg2;

import assignment2.pkg1.Member;

public class Teacher extends Member{
  protected String title;

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

  @Override
  public String getEmail(){
    return this.name + DOMAIN;
  }

  @Override
  public boolean canReserveRoom(){
    return true;
  }
}

package sample2.pkg2;

import sample2.pkg1.Member;

public class Student extends Member{
  protected int grade;

  public Student(String id, String name, int grade) {
    super(id, name);
    this.grade = grade;
  }

  @Override
  public String getProfile(){
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("----- Student -----").append("\n");
    stringBuffer.append(super.getProfile());
    stringBuffer.append("Grade : ").append(this.grade).append("\n");

    return stringBuffer.toString();
  }

  @Override
  public String getEmail(){
    return this.id+ DOMAIN;
  }

  @Override
  public boolean canReserveRoom(){
    return false;
  }
}


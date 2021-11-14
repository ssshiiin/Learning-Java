package assignment2.pkg2;

import assignment2.pkg3.Programmer;

public class EngineeringStudent extends Student implements Programmer {
  public EngineeringStudent(String id, String name, int grade){
    super(id, name, grade);
  }

  @Override
  public boolean canWritePython(){
    return true;
  }

  @Override
  public boolean canWriteC(){
    return (super.grade >= 2);
  }
  @Override
  public boolean canWriteJava(){
    return (super.grade >= 3);
  }

}

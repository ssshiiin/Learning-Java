package assignment2.pkg2;

import assignment2.pkg3.Programmer;

public class EngineeringTeacher extends Teacher implements Programmer {

  public EngineeringTeacher(String id, String name, String title){
    super(id, name, title);
  }

  @Override
  public boolean canWritePython(){
    return true;
  }

  @Override
  public boolean canWriteC(){
    return true;
  }

  @Override
  public boolean canWriteJava(){
    return true;
  }
  
}

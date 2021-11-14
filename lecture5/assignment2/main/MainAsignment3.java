package assignment2.main;

import assignment2.pkg2.EngineeringStudent;
import assignment2.pkg2.EngineeringTeacher;
import assignment2.pkg3.Programmer;

public class MainAsignment3 {
  public static void main(String[] args){
    EngineeringStudent st = new EngineeringStudent("1234", "taro", 1);
    EngineeringTeacher tc = new EngineeringTeacher("1234", "bessho", "software");
    System.out.printf(st.getProfile());
    checkSkill(st);
    System.out.printf(tc.getProfile());
    checkSkill(tc);
  }

  public static void checkSkill(Programmer p){
    if(p.canWritePython()){
      System.out.println("I can write python.");
    }
    if(p.canWriteC()){
      System.out.println("I can write C.");
    }
    if(p.canWriteJava()){
      System.out.println("I can write java.");
    }
  }
}

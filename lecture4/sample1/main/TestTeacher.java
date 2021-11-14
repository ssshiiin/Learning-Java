package sample1.main;

import sample1.pkg2.Teacher;

public class TestTeacher {
  public static void main(String[] args){
    Teacher teacher = new Teacher("1234", "Bessho", "java");
    System.out.println(teacher.getProfile());
  }
}

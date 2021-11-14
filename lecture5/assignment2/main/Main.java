package assignment2.main;

import assignment2.pkg2.Student;
import assignment2.pkg2.Teacher;

public class Main {
  public static void main(String[] args){
    Student student = new Student("1234", "Bessho", 3);
    Teacher teacher = new Teacher("1234", "Bessho", "java");

    System.out.println(student.getProfile());
    System.out.println(teacher.getProfile());
  }
}

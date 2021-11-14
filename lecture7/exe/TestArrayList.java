package exe;

import java.util.ArrayList;

public class TestArrayList {
  public static void main(String[] argv) {
    ArrayList<Student> myList = new ArrayList();

    Student alice = new Student("Alice");
    Student bob = new Student("bob");
    myList.add(alice);
    myList.add(bob);

    myList.forEach(i -> System.out.println(i)); 
  }
}

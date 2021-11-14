package exe1;

public class MyStackTest {
  public static void main (String[] argv) {
    MyStack<String> ms1 = new MyStack<String>(10);
    MyStack<Student> ms2 = new MyStack<Student>(2);

    ms1.push("Apple");
    ms1.push("Banana");
    ms1.push("Orange");

    ms2.push(new Student("Bob", 10, "001"));
    ms2.push(new Student("Alice", 12, "002"));

    String s1 = ms1.pop();
    System.out.println(s1);
    
    Student s2 = ms2.pop();
    System.out.println(s2.getName());
  }
}

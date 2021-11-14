package exercise.asignment2;

public class Main {
  public static void main (String[] args){
    Human human = new Human();
    Dog dog = new Dog();
    Cat cat = new Cat();

    human.eat();
    System.out.printf("Human stomach: %s\n", human.stomach);
    human.run();
    System.out.printf("Human stomach: %s\n", human.stomach);
    dog.eat();
    System.out.printf("Dog stomach: %s\n", dog.stomach);
    dog.run();
    System.out.printf("Dog stomach: %s\n", dog.stomach);
    cat.eat();
    System.out.printf("Cat stomach: %s\n", cat.stomach);
    cat.run();
    System.out.printf("Cat stomach: %s\n", cat.stomach);
    
    System.out.printf("Human: %s\n", human.talk());
    System.out.printf("Dog: %s\n", dog.bark());
    System.out.printf("Cat: %s\n", cat.bark());
    
  }
}

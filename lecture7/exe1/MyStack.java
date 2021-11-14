package exe1;

public class MyStack<E> {
  final private int size;
  private int top;
  private E[] elements;

  @SuppressWarnings("unchecked")
  public MyStack(int size) {
    this.size = size;
    this.top = 0;
    this.elements = (E[]) new Object[size];
  }

  public void push (E element) {
    this.elements[this.top] = element;
    this.top++;
  }

  public E pop () {
    this.top--;
    E element = this.elements[top];  
    this.elements[top] = null;  
    return element;
  }
}

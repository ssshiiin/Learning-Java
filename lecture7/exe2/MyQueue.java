package exe2;

public class MyQueue<E> {
  private int size;
  private int tail;
  private int head;
  private E[] elements;

  @SuppressWarnings("unchecked")
  public MyQueue(int size) {
    this.size = size;
    this.tail = 0;
    this.head = 0;
    this.elements = (E[]) new Object[size];
  }

  public void enqueue(E x) {
    this.elements[this.tail] = x;
    this.tail++;
    this.tail %= this.size;
  }

  public E dequeue() {
    E ret = this.elements[this.head];
    this.head++;
    this.head %= this.size;

    return ret;
  }
}

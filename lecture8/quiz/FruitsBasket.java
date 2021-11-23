package quiz;

import java.util.ArrayList;

public class FruitsBasket {
  ArrayList<Fruit> fruitArray = new ArrayList<>();

  void add(Fruit fruit) {
    this.fruitArray.add(fruit);
  }

  void print() {
    StringBuffer sb = new StringBuffer();
    for (Fruit fruit: this.fruitArray) {
      sb.append(fruit.getColor());
      sb.append("\n");
    }
    System.out.printf("%s", sb.toString());
  }
}

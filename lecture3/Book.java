public class Book {
  public String name;
  public Author author;
  public int price;

  public Book (String name, Author author){
    this.name = name;
    this.author = author;
  }

  public Book (String name, Author author, int price){
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public String getName(){
    return this.name;
  }

  public String getAuthor(){
    return this.author.toString();
  }
  
  public int getPrice(){
    return this.price;
  }

  public void setPrice(int price){
    this.price = price;
  }
}

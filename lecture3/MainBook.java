public class MainBook {
  public static void main(String[] args){
    Author author = new Author("Alice", "alice@example.com");
    Book book = new Book("Bummybook", author, 5000);

    System.out.println(book.getName());
    System.out.println(book.getAuthor());
    System.out.println(book.getPrice());
    
    book.author.setEmail("alice2@example.com");
    book.setPrice(5500);

    System.out.println(book.getName());
    System.out.println(book.getAuthor());
    System.out.println(book.getPrice());
  } 
}

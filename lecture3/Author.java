public class Author {
  protected String name;
  protected String email;
  

  public Author (String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName(){
    return this.name;
  }

  public String getEmail(){
    return this.email;
  }

  public void setEmail(String email){
    this.email = email;
  } 
  
  public String toString(){
    return "Author [name = " + this.name + " email= " + this.email;
  }
}

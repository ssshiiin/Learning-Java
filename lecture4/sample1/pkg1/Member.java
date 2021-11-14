package sample1.pkg1;

public class Member{
  public static final String DOMAIN = "@iniad.org";
  public String id;
  public String name;

  public Member(String id, String name){
    this.id = id;
    this.name = name;
  }

  public String getEmail(){
    return this.id + DOMAIN;
  }

  public String getProfile(){
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("ID : ").append(this.id).append("\n");
    stringBuffer.append("Name : ").append(this.name).append("\n");
    String email = getEmail();
    stringBuffer.append("email : ").append(email).append("\n");

    return stringBuffer.toString();
  }
}
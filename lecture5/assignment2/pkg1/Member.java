package assignment2.pkg1;

abstract public class Member{
  protected static final String DOMAIN = "@iniad.org";
  protected String id;
  protected String name;

  public Member(String id, String name){
    this.id = id;
    this.name = name;
  }

  
  public String getProfile(){
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("ID : ").append(this.id).append("\n");
    stringBuffer.append("Name : ").append(this.name).append("\n");
    String email = getEmail();
    stringBuffer.append("email : ").append(email).append("\n");
    if(canReserveRoom()){
      stringBuffer.append("Room: OK").append("\n");
    } else {
      stringBuffer.append("Room: NG").append("\n");
    }
    
    return stringBuffer.toString();
  }
  
  abstract public String getEmail();

  abstract public boolean canReserveRoom();
}

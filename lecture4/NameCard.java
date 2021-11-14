public class NameCard {
  final String firstName;
  final String familyName;
  final int id;
  static int count = 1; 

  public NameCard(String firstName, String familyName){
    this.firstName = firstName;
    this.familyName = familyName;
    this.id = count;
    count++;
  }

  public String getLabel(){
    return "No, " + this.id + " : " + this.firstName + " " + this.familyName;
  }
}
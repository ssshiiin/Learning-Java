public class MainTime {
  public static void main(String[] args){
    Time time = new Time(16, 7, 30);

    time.setHour(time.getHour() + 1);

    System.out.println(time.getCurrentTime());
  }
}

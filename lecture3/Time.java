public class Time {
  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour(){
    return this.hour;
  } 

  public void setHour(int hour){
    if(hour >= 0 && hour <= 23) {
      this.hour = hour;
    } else {
      System.out.println("不正な値");
    }
  }

  public int getMinute(){
    return this.minute;
  } 

  public void setMinute(int minute){
    if(minute >= 0 && minute <= 59) {
      this.minute = minute;
    } else {
      System.out.println("不正な値");
    }
  }

  public int[] getter(int hour, int minute){
    int[] result = {this.minute, this.second};
    return result;
  }

  public void setter(int minute, int second){
    if(minute >= 0 && minute <= 59) {
      this.minute = minute;
      if (second >= 0 && second <= 59){
      this.second = second;
      } else {
        System.out.println("secondが不正な値");
      }
    } else {
      System.out.println("minuteが不正な値");
      if (second >= 0 && second <= 59){
      this.second = second;
      } else {
        System.out.println("secondが不正な値");
      }
    }
  }

  public String getCurrentTime() {
    return this.hour + "時" + this.minute + "分" + this.second + "秒";
  } 
}

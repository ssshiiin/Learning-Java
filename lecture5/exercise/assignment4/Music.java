package exercise.assignment4;

import java.util.List;

public class Music extends Media implements Playable {
  private List<String> sounds;
  public Music (String content, List<String> sounds){
    this.content = content;
    this.sounds = sounds;
  }

  @Override
  public String play(){
    StringBuffer sb = new StringBuffer();

    for (String str : this.sounds){
      sb.append(str);
    }

    return sb.toString();
  }
}

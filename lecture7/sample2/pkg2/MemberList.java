package sample2.pkg2;

import java.util.LinkedList;

import sample2.pkg1.Member;

public class MemberList {
  protected LinkedList<Member> lst = new LinkedList<Member>();

  public void add (Member member) {
    this.lst.add(member);
  }

  public int count () {
    return this.lst.size();
  }

  public Member get(String id) {
    for (Member member: this.lst) {
      if(member.getId() == id) {
        return member;
      }
    }

    return null;
  }

  public void remove(String id) {
    for (Member member: this.lst) {
      if(member.getId() == id) {
        this.lst.remove(member);
      }
    }
  }
}

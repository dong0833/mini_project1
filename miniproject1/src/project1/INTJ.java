package project1;

import project2.Clayshooting;
import project3.Point_INTJ;
import project4.Person_INTJ;
import project5.MBTI;

public class INTJ extends MBTI {

	public INTJ(Person_INTJ personality, Point_INTJ attentionpoint, Clayshooting sports) {
		 personality = new Person_INTJ();
		 attentionpoint = new Point_INTJ();
		 sports = new Clayshooting();
	}
	
	public INTJ() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("내 갈 길만 가는 단호박!!");

	}

}

package project1;

import project2.Yoga;
import project3.Point_ISFJ;
import project4.Person_ISFJ;
import project5.MBTI;

public class ISFJ extends MBTI {
	
	public ISFJ(Person_ISFJ personality, Point_ISFJ attentionpoint, Yoga sports) {
		 personality = new Person_ISFJ();
		 attentionpoint = new Point_ISFJ();
		 sports = new Yoga();
	}
	
	public ISFJ() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("배려심 많은 프로 도움러!!");

	}

}

package project1;

import project2.Surfing;
import project3.Point_ISTP;
import project4.Person_ISTP;
import project5.MBTI;

public class ISTP extends MBTI {

	public ISTP(Person_ISTP personality, Point_ISTP attentionpoint, Surfing sports) {
		 personality = new Person_ISTP();
		 attentionpoint = new Point_ISTP();
		 sports = new Surfing();
	}
	public ISTP() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void display() {
		System.out.println("???????? ? ??¦??!!");

	}

}

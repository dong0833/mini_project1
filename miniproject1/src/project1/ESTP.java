package project1;

import project2.Boxing;
import project3.Point_ESTP;
import project4.Person_ESTP;
import project5.MBTI;

public class ESTP extends MBTI {

	public ESTP(Person_ESTP personality, Point_ESTP attentionpoint, Boxing sports) {
		 personality = new Person_ESTP();
		 attentionpoint = new Point_ESTP();
		 sports = new Boxing();
	}
	
	public ESTP() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("순발력 뛰어난 스릴파!!");

	}
}

package project1;

import project2.EMSTraning;
import project3.Point_INTP;
import project4.Person_INTP;
import project5.MBTI;

public class INTP extends MBTI {

	public INTP(Person_INTP personality, Point_INTP attentionpoint, EMSTraning sports) {
		 personality = new Person_INTP();
		 attentionpoint = new Point_INTP();
		 sports = new EMSTraning();
	}
	
	public INTP() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("몸보단 머리가 부지런한 마이웨이!!");

	}

}

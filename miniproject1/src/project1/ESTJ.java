package project1;

import project2.Tenis;
import project3.Point_ESTJ;
import project4.Person_ESTJ;
import project5.MBTI;

public class ESTJ extends MBTI {

	public ESTJ(Person_ESTJ personality, Point_ESTJ attentionpoint, Tenis sports) {
		 personality = new Person_ESTJ();
		 attentionpoint = new Point_ESTJ();
		 sports = new Tenis();
	}
	
	public ESTJ() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("룰을 중요시하는 본투비 리더!!");

	}

}

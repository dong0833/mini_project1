package project1;

import project2.Riding;
import project3.Point_ISFP;
import project4.Person_ISFP;
import project5.MBTI;

public class ISFP extends MBTI{
	
	public ISFP(Person_ISFP personality, Point_ISFP attentionpoint, Riding sports) {
		 personality = new Person_ISFP();
		 attentionpoint = new Point_ISFP();
		 sports = new Riding();
	}
	
	public ISFP() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("결정장애 심한 평화주의자!!");

	}

}

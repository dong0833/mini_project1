package project1;

import project2.Clubactivities;
import project3.Point_ESTJ;
import project4.Person_ESTJ;
import project5.MBTI;

public class ESFJ extends MBTI {

	public ESFJ(Person_ESTJ personality, Point_ESTJ attentionpoint, Clubactivities sports) {
		 personality = new Person_ESTJ();
		 attentionpoint = new Point_ESTJ();
		 sports = new Clubactivities();
	}
	
	public ESFJ() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("단합이 중요한 박애주의자!!");

	}

}

package project1;

import project2.Swim;
import project3.Point_ISTJ;
import project4.Person_ISTJ;
import project5.MBTI;

public class ISTJ extends MBTI {
	
	public ISTJ(Person_ISTJ personality, Point_ISTJ attentionpoint, Swim sports) {
		 personality = new Person_ISTJ();
		 attentionpoint = new Point_ISTJ();
		 sports = new Swim();
	}

	public ISTJ() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("테두리를 애정하는 원칙주의자!!");

	}

}

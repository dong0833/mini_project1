package project1;

import project2.VRExercise;
import project3.Point_ENTP;
import project4.Person_ENTP;
import project5.MBTI;

public class ENTP extends MBTI {

	public ENTP(Person_ENTP personality, Point_ENTP attentionpoint, VRExercise sports) {
		 personality = new Person_ENTP();
		 attentionpoint = new Point_ENTP();
		 sports = new VRExercise();
	}
	
	public ENTP() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("뒷심 부족 재능킹!!");

	}

}

package project1;

import project2.RunningCrew;
import project3.Point_ESFP;
import project4.Person_ESFP;
import project5.MBTI;

public class ESFP extends MBTI {

	public ESFP(Person_ESFP personality, Point_ESFP attentionpoint, RunningCrew sports) {
		 personality = new Person_ESFP();
		 attentionpoint = new Point_ESFP();
		 sports = new RunningCrew();
	}
	
	public ESFP() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("? ?????? ???ν?!!");

	}

}

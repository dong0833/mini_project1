package project1;

import project2.Climing;
import project3.Point_INFJ;
import project4.Person_INFJ;
import project5.MBTI;

public class INFJ extends MBTI {
	
	public INFJ(Person_INFJ personality, Point_INFJ attentionpoint, Climing sports) {
		 personality = new Person_INFJ();
		 attentionpoint = new Point_INFJ();
		 sports = new Climing();
	}
	
	public INFJ() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("생각 많고 섬세한 평화주의자!!");

	}

}

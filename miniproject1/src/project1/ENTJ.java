package project1;

import project2.Poledance;
import project3.Point_ENTJ;
import project4.Person_ENTJ;
import project5.MBTI;

public class ENTJ extends MBTI {

	public ENTJ(Person_ENTJ personality, Point_ENTJ attentionpoint, Poledance sports) {
		 personality = new Person_ENTJ();
		 attentionpoint = new Point_ENTJ();
		 sports = new Poledance();
	}
	public ENTJ() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		System.out.println("������ ������ �ҵ���!!");

	}

}

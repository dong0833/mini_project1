package project1;

import project2.Zumba;
import project3.Point_ESTP;
import project4.Person_ENFJ;
import project5.MBTI;

public class ENFP extends MBTI {
	

	public ENFP(Person_ENFJ personality, Point_ESTP attentionpoint, Zumba sports) {
		 personality = new Person_ENFJ();
		 attentionpoint = new Point_ESTP();
		 sports = new Zumba();
	}
	// 아규먼트가 있으면 없는것 까지 불러와야 하기 떄문에  public ENFJ() {}를 만들어줘야 한다.
	public ENFP() {
	}

	@Override
	public void display() {
		System.out.println("활기 넘치는 즉흥러!!");

	}

}

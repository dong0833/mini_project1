package project1;

import project2.Philoxing;
import project3.Point_INFP;
import project4.Person_INFP;
import project5.MBTI;

public class INFP extends MBTI{
	
	public INFP(Person_INFP personality, Point_INFP attentionpoint, Philoxing sports) {
		 personality = new Person_INFP();
		 attentionpoint = new Point_INFP();
		 sports = new Philoxing();
	}
	
	public INFP() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("실행력 부족한 완벽주의자!!");

	}

}

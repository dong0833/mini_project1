package project1;

import project2.TeamCrossFit;
import project3.Point_ENFJ;
import project4.Person_ENFJ;
import project5.MBTI;

public class ENFJ extends MBTI {

	public ENFJ() {
		
	}

	public ENFJ(Person_ENFJ personality, Point_ENFJ attentionpoint, TeamCrossFit sports) {
		personality = new Person_ENFJ();
		attentionpoint = new Point_ENFJ();
		sports = new TeamCrossFit();
	}

	@Override
	public void display() {
		System.out.println("�ν� ���� ���� ���κ���!!");

	}

}

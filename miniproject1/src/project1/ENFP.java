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
	// �ƱԸ�Ʈ�� ������ ���°� ���� �ҷ��;� �ϱ� ������  public ENFJ() {}�� �������� �Ѵ�.
	public ENFP() {
	}

	@Override
	public void display() {
		System.out.println("Ȱ�� ��ġ�� ���﷯!!");

	}

}
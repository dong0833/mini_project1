package project5;

import lombok.Data;

@Data
public abstract class MBTI {

	private Sports sports;
	private Personality personality;
	private AttentionPoint attentionpoint;

	public MBTI() { }

	public abstract void display();

	// Sports �������̽��� �ִ� � �޼ҵ� ���
	public void exercise() {
		sports.sports();
	}

	// exercise �������̽��� �ִ� ���� �޼ҵ� ���
	public void personalityTendencies() {
		personality.personality();
	}

	// attentionpoint �������̽��� �ִ� ���� �޼ҵ� ���
	public void contens() {
		attentionpoint.attentionpoint();
	}

	
}
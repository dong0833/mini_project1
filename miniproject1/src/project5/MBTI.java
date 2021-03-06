package project5;

import lombok.Data;

@Data
public abstract class MBTI {

	private Sports sports;
	private Personality personality;
	private AttentionPoint attentionpoint;

	public MBTI() { }

	public abstract void display();

	// Sports 인터페이스에 있는 운동 메소드 출력
	public void exercise() {
		sports.sports();
	}

	// exercise 인터페이스에 있는 성향 메소드 출력
	public void personalityTendencies() {
		personality.personality();
	}

	// attentionpoint 인터페이스에 있는 성향 메소드 출력
	public void contens() {
		attentionpoint.attentionpoint();
	}

	
}

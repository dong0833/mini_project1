package project5;

import lombok.Data;

// MBTI 검사 받을 고객 정보 저장 클래스
@Data
public class Users {
	// 이름
	private String name;
	// 나이
	private int age;
	// TODO: MBTI 타입 검사 결과
	
	// TODO: MBTI 운동 방법 결과
	
	// TODO: MBTI 솔루션 결과
	
	// 생성자
	Users(){ }
	
	
	// 생성자
	Users(String name, int age){
		this.name = name;
		this.age = age;


				
	}
	
	// TODO: 5개의 파라미터를 가지고 있는 생성자
}
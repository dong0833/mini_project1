package project5;

import lombok.Data;

// MBTI �˻� ���� ���� ���� ���� Ŭ����
@Data
public class Users {
	// �̸�
	private String name;
	// ����
	private int age;
	// TODO: MBTI Ÿ�� �˻� ���
	
	// TODO: MBTI � ��� ���
	
	// TODO: MBTI �ַ�� ���
	
	// ������
	Users(){ }
	
	
	// ������
	Users(String name, int age){
		this.name = name;
		this.age = age;


				
	}
	
	// TODO: 5���� �Ķ���͸� ������ �ִ� ������
}
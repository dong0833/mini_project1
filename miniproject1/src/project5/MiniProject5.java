package project5;

import java.util.ArrayList;
import java.util.Scanner;

import project1.ENFJ;
import project1.ENFP;
import project1.ENTJ;
import project1.ENTP;
import project1.ESFJ;
import project1.ESFP;
import project1.ESTJ;
import project1.ESTP;
import project1.INFJ;
import project1.INFP;
import project1.INTJ;
import project1.INTP;
import project1.ISFJ;
import project1.ISFP;
import project1.ISTJ;
import project1.ISTP;
import project2.Boxing;
import project2.Clayshooting;
import project2.Climing;
import project2.Clubactivities;
import project2.EMSTraning;
import project2.Philoxing;
import project2.Poledance;
import project2.Riding;
import project2.RunningCrew;
import project2.Surfing;
import project2.Swim;
import project2.TeamCrossFit;
import project2.Tenis;
import project2.VRExercise;
import project2.Yoga;
import project2.Zumba;
import project3.Point_ENFJ;
import project3.Point_ENFP;
import project3.Point_ENTJ;
import project3.Point_ENTP;
import project3.Point_ESFJ;
import project3.Point_ESFP;
import project3.Point_ESTJ;
import project3.Point_ESTP;
import project3.Point_INFJ;
import project3.Point_INFP;
import project3.Point_INTJ;
import project3.Point_INTP;
import project3.Point_ISFJ;
import project3.Point_ISFP;
import project3.Point_ISTP;
import project4.Person_ENFJ;
import project4.Person_ENFP;
import project4.Person_ENTJ;
import project4.Person_ENTP;
import project4.Person_ESFJ;
import project4.Person_ESFP;
import project4.Person_ESTJ;
import project4.Person_ESTP;
import project4.Person_INFJ;
import project4.Person_INFP;
import project4.Person_INTJ;
import project4.Person_INTP;
import project4.Person_ISFJ;
import project4.Person_ISFP;
import project4.Person_ISTJ;
import project4.Person_ISTP;

public class MiniProject5 {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		// MBTI �˻� ���� ���� ����
		ArrayList<Users> userList = new ArrayList<Users>();
		// ��� ����� ���� ����
		String mbtiResult = "";
		String userName;
		int userAge;
		
		Scanner input = new Scanner(System.in);

		System.out.print("�˻��� �̸� �Է�: ");
		userName = input.nextLine();
		

		System.out.print("�˻��� ���� �Է�: ");
		userAge = input.nextInt();

		System.out.println("============================================\n�� �˻����� ������ (��1��) vs (��2��)���� �Ǿ��ֽ��ϴ�.\n���̸� 1�� �ڸ� 2���� �����ø� �˴ϴ�.\n============================================");
		System.out.println("E(����) vs I(����)");

		
		int E = 0;
		int I = 0;

		System.out.print("1.�پ��� Ȱ���� ��ȣ�ϴ� �� vs 1.�� ������ �����ϴ� �� (press 1 or 2): ");
		int T1 = input.nextInt();
		if (T1 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("2.�ۿ��� Ȱ���ϱ� �����ϴ� �� vs 2.�ǳ��� �ֱ⸦ �����Ѵ�. (press 1 or 2): ");
		int T2 = input.nextInt();
		if (T2 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("3.���� ���� �ϴ� �� vs 3. ���� �����ϴ� �� (press 1 or 2): ");
		int T3 = input.nextInt();
		if (T3 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("4.�� �߰��� �� ������ �� vs 4.���� ������ �� ��� �� (press 1 or 2): ");
		int T4 = input.nextInt();
		if (T4 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("5.�����ϴٴ� ���� ��� �� vs 5.ħ���ϴٴ� ���� ��� �� (press 1 or 2): ");
		int T5 = input.nextInt();
		if (T5 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("6.������ �����ϰ� ǥ���ϴ� �� vs �Ӹ����� �� �巯���� �ʴ� �� (press 1 or 2): ");
		int T6 = input.nextInt();
		if (T6 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("7.���а� ģ���� ��ʹ� �� vs 7.�Ҽ��� ģ�� ģ���� ��ʹ� �� (press 1 or 2): ");
		int T7 = input.nextInt();
		if (T7 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("8.������ ������ ���� ���� �� vs 8.ȥ�� �־ ���� ���� �� (press 1 or 2): ");
		int T8 = input.nextInt();
		if (T8 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("9.Ȱ������ ��̸� ���� �� vs 9.������ ��̸� ���� �� (press 1 or 2): ");
		int T9 = input.nextInt();
		if (T9 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		String result1 = "E(����)";
		String result2 = "I(����)";

		if (I < E) {
			System.out.println(result1);
			mbtiResult += "E";
			// total.add("E");
		} else {
			System.out.println(result2);
			mbtiResult += "I";
			// total.add("I");
		}

		System.out.println("S(����) vs N(����)");

		int S = 0;
		int N = 0;

		System.out.print("10.���迡 �����ϴ� �� vs 10.���̵� �����ϴ� �� (press 1 or 2): ");
		int T11 = input.nextInt();
		if (T11 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("11.�������� �� vs 11.�̷��������� �� (press 1 or 2): ");
		int T12 = input.nextInt();
		if (T12 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("12.Ȯ���� ���� ��ȣ�ϴ� �� vs 12.�ָ��ص� ������ ���� ��ȣ�ϴ� �� (press 1 or 2): ");
		int T13 = input.nextInt();
		if (T13 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("13.Ȯ�ε� ����� �߿���ϴ� �� vs 13.�������� ���ɼ��� �߿���ϴ� �� (press 1 or 2): ");
		int T14 = input.nextInt();
		if (T14 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("14.�������� ���� ������ �� vs 14.�������� ū �׸��� ���� �� (press 1 or 2): ");
		int T15 = input.nextInt();
		if (T15 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("15.��ȿ���� ���� ���� ��ȣ�ϴ� �� vs 15.���� ������ �ִ� ���� ��ȣ�ϴ� �� (press 1 or 2): ");
		int T16 = input.nextInt();
		if (T16 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("16.Ȯ���� �����͸� �ϴ� �� vs 16.�������� ������ �ϴ� �� (press 1 or 2): ");
		int T17 = input.nextInt();
		if (T17 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("17.���� ���� ������ ��ȣ�ϴ� �� vs 17.�������� ��ȭ�� ��ȣ�ϴ� �� (press 1 or 2): ");
		int T18 = input.nextInt();
		if (T18 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("18.����� �ǿ伺�� ���� ���� �� vs 18.�������� ���� ���� �� (press 1 or 2): ");
		int T19 = input.nextInt();
		if (T19 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}

		String result3 = "S(����)";
		String result4 = "N(����)";

		if (N < S) {
			System.out.println(result3);
			mbtiResult += "S";
			// total.add("S");
		} else {
			System.out.println(result4);
			mbtiResult += "N";
			// total.add("N");
		}

		System.out.println("T(�Ǵ�) vs F(�ν�)");


		int T = 0;
		int F = 0;

		System.out.print("19.��Ģ��� �ϴ� �� vs 19.��ȭ�� �����ؼ� ��� �� (press 1 or 2): ");
		int T21 = input.nextInt();
		if (T21 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("20.�� ������ �ϴ� �� vs 20.���� ������ �����ϴ� �� (press 1 or 2): ");
		int T22 = input.nextInt();
		if (T22 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("21.�� ���ַ� �ϴ� �� vs 21.����� ��� ���ַ� �ϴ� �� (press 1 or 2): ");
		int T23 = input.nextInt();
		if (T23 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("22.�����ϰ� �ϴ� �� vs 22. ��Ȳ�� ���� �����ϴ� �� (press 1 or 2): ");
		int T24 = input.nextInt();
		if (T24 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("23.��ö�� �̼����� �Ǵ��ϴ� �� vs 23.���� ������ ��� �Ǵ��ϴ� �� (press 1 or 2): ");
		int T25 = input.nextInt();
		if (T25 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("24.��ö�ϴٴ� ���� ��� �� vs 24.������ �����ϴٴ� ���� ��� �� (press 1 or 2): ");
		int T26 = input.nextInt();
		if (T26 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("25.���� ���� ������ �� vs 25.�����ϸ� ���� �����ϴ� �� (press 1 or 2): ");
		int T27 = input.nextInt();
		if (T27 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("26.���� �ϴ� �� vs 26.������ ������ �� (press 1 or 2): ");
		int T28 = input.nextInt();
		if (T28 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("27.����� �߿��ϰ� ����� �� vs 27.������ �߿��ϰ� ����� �� (press 1 or 2): ");
		int T29 = input.nextInt();
		if (T29 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}

		String result5 = "T(���)";
		String result6 = "F(����)";

		if (F < T) {
			System.out.println(result5);
			mbtiResult += "T";
			// total.add("T");
		} else {
			System.out.println(result6);
			mbtiResult += "F";
			// total.add("F");
		}

		System.out.println("J(�Ǵ�) vs P(�ν�)");


		int J = 0;
		int P = 0;

		System.out.print("28.������ ��ȹ�ϴ� �� vs 28.�ϴ� �ذ��鼭 ��ȹ�ϴ� �� (press 1 or 2):");
		int T31 = input.nextInt();
		if (T31 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("29.��ȹ��� �ϴ� �� vs 29.��Ȳ�� ���� �����ϰ� �ϴ� �� (press 1 or 2): ");
		int T32 = input.nextInt();
		if (T32 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("30.�������� ���ϴ� �� vs 30.���� ���ϴ� ���̴�. (press 1 or 2): ");
		int T33 = input.nextInt();
		if (T33 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("31.��ȹ�� ¥�� �־�� ������ ���ϴ�. vs 31.��ȹ�� ����� ������ �����Ӵ�. (press 1 or 2): ");
		int T34 = input.nextInt();
		if (T34 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("32.��ȹ�� �Ϳ��� �����ϴ� �� vs 32.��ȹ�� ���� �ϵ� ���� �� ��� �� (press 1 or 2): ");
		int T35 = input.nextInt();
		if (T35 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("33.����ϰ� �����س��� ������. vs 33.���������� �ڷ� �̷��. (press 1 or 2): ");
		int T36 = input.nextInt();
		if (T36 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("34.����� �� ������ �� vs 34.���̵� �� �޾Ƶ��̴� �� (press 1 or 2): ");
		int T37 = input.nextInt();
		if (T37 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("35.������ ���� �̷��� �ʴ� �� vs 35.�̷�⵵ �� �ϴ� �� (press 1 or 2): ");
		int T38 = input.nextInt();
		if (T38 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("36.��ǥ�� �и��� �� vs 36.��ǥ�� ��Ȳ�� ���� �ٲٴ� �� (press 1 or 2): ");
		int T39 = input.nextInt();
		if (T39 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}

		String result7 = "J(�Ǵ�)";
		String result8 = "P(�ν�)";

		if (P < J) {
			System.out.println(result7);
			mbtiResult += "J";
			// total.add("J");
		} else {
			System.out.println(result8);
			mbtiResult += "P";
			// total.add("P");
		}
		// User ��ü ���� (�ʱⰪ / ���� �̸�, ����)
		userList.add(new Users(userName, userAge));
		// TODO: User ��ü ���� (�ʱⰪ / ���� �̸�, ����, MBTI Type, MBTI �, MBTI �ַ��))
		
		
			// TODO: �˻� ���� ������ ����� ���
			System.out.println("�̸� : " + userName + " " + " ���� : " + userAge);
			// �̸�, ����, MBTI Type, MBTI �, MBTI �ַ��
            System.out.println("��� : " + mbtiResult);

		
		// mbtiResult ��� ������� ���� ���ǽ� (16�� ���ǽ�)
		switch (mbtiResult) {
			case "ISTJ": {
				MBTI istjType = new ISTJ();
				istjType.display();
				istjType.setPersonality(new Person_ISTJ());
				istjType.personalityTendencies();
				istjType.setSports(new Swim());
				istjType.exercise();
				istjType.setAttentionpoint(new Point_INTJ());
				istjType.contens();
			} break;
			case "ISFJ": {
				MBTI isfjType = new ISFJ();
				isfjType.display();
				isfjType.setPersonality(new Person_ISFJ());
				isfjType.personalityTendencies();
				isfjType.setSports(new Yoga());
				isfjType.exercise();
				isfjType.setAttentionpoint(new Point_ISFJ());
				isfjType.contens();
			} break;
			case "ESTP": {
				MBTI estpType = new ESTP();
				estpType.display();
				estpType.setPersonality(new Person_ESTP());
				estpType.personalityTendencies();
				estpType.setSports(new Boxing());
				estpType.exercise();
				estpType.setAttentionpoint(new Point_ESTP());
				estpType.contens();
			} break;
			case "ESFP": {
				MBTI esfpType = new ESFP();
				esfpType.display();
				esfpType.setPersonality(new Person_ESFP());
				esfpType.personalityTendencies();
				esfpType.setSports(new RunningCrew());
				esfpType.exercise();
				esfpType.setAttentionpoint(new Point_ESFP());
				esfpType.contens();
			}break;
			case "INFJ": {
				MBTI infjType = new INFJ();
				infjType.display();
				infjType.setPersonality(new Person_INFJ());
				infjType.personalityTendencies();
				infjType.setSports(new Climing());
				infjType.exercise();
				infjType.setAttentionpoint(new Point_INFJ());
				infjType.contens();
			}break;
			case "INTJ": {
				MBTI intjType = new INTJ();
				intjType.display();
				intjType.setPersonality(new Person_INTJ());
				intjType.personalityTendencies();
				intjType.setSports(new Clayshooting());
				intjType.exercise();
				intjType.setAttentionpoint(new Point_INTJ());
				intjType.contens();
			}break;
			case "ENFP": {
				MBTI enfpType = new ENFP();
				enfpType.display();
				enfpType.setPersonality(new Person_ENFP());
				enfpType.personalityTendencies();
				enfpType.setSports(new Zumba());
				enfpType.exercise();
				enfpType.setAttentionpoint(new Point_ENFP());
				enfpType.contens();
			}break;
			case "ENTP": {
				MBTI entpType = new ENTP();
				entpType.display();
				entpType.setPersonality(new Person_ENTP());
				entpType.personalityTendencies();
				entpType.setSports(new VRExercise());
				entpType.exercise();
				entpType.setAttentionpoint(new Point_ENTP());
				entpType.contens();
			}break;
			case "ISTP": {
				MBTI istpType = new ISTP();
				istpType.display();
				istpType.setPersonality(new Person_ISTP());
				istpType.personalityTendencies();
				istpType.setSports(new Surfing());
				istpType.exercise();
				istpType.setAttentionpoint(new Point_ISTP());
				istpType.contens();
			}break;
			case "ISFP": {
				MBTI isfpType = new ISFP();
				isfpType.display();
				isfpType.setPersonality(new Person_ISFP());
				isfpType.personalityTendencies();
				isfpType.setSports(new Riding());
				isfpType.exercise();
				isfpType.setAttentionpoint(new Point_ISFP());
				isfpType.contens();
			}break;
			case "ESTJ": {
				MBTI estjType = new ESTJ();
				estjType.display();
				estjType.setPersonality(new Person_ESTJ());
				estjType.personalityTendencies();
				estjType.setSports(new Tenis());
				estjType.exercise();
				estjType.setAttentionpoint(new Point_ESTJ());
				estjType.contens();
			}break;
			case "ESFJ":{
				MBTI esfjType = new ESFJ();
				esfjType.display();
				esfjType.setPersonality(new Person_ESFJ());
				esfjType.personalityTendencies();
				esfjType.setSports(new Clubactivities());
				esfjType.exercise();
				esfjType.setAttentionpoint(new Point_ESFJ());
				esfjType.contens();
			}break;
			case "INFP": {
				MBTI infpType = new INFP();
				infpType.display();
				infpType.setPersonality(new Person_INFP());
				infpType.personalityTendencies();
				infpType.setSports(new Philoxing());
				infpType.exercise();
				infpType.setAttentionpoint(new Point_INFP());
				infpType.contens();
			}break;
			case "INTP": {
				MBTI intpType = new INTP();
				intpType.display();
				intpType.setPersonality(new Person_INTP());
				intpType.personalityTendencies();
				intpType.setSports(new EMSTraning());
				intpType.exercise();
				intpType.setAttentionpoint(new Point_INTP());
				intpType.contens();
			}break;
			case "ENFJ": {
				MBTI enfjType = new ENFJ();
				enfjType.display();
				enfjType.setPersonality(new Person_ENFJ());
				enfjType.personalityTendencies();
				enfjType.setSports(new TeamCrossFit());
				enfjType.exercise();
				enfjType.setAttentionpoint(new Point_ENFJ());
				enfjType.contens();
			}break;
			case "ENTJ": {
				MBTI entjType = new ENTJ();
				entjType.display();
				entjType.setPersonality(new Person_ENTJ());
				entjType.personalityTendencies();
				entjType.setSports(new Poledance());
				entjType.exercise();
				entjType.setAttentionpoint(new Point_ENTJ());
				entjType.contens();
			}break;
		}
		





		
//		if (mbtiResult.equals("ISTJ")) {
//			MBTI istjType = new ISTJ();
//			istjType.setSports(new Swim());
//			istjType.getSports().sports();
//		}
	}
}
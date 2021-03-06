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

		// MBTI 검사 받은 유저 관리
		ArrayList<Users> userList = new ArrayList<Users>();
		// 출력 결과물 저장 변수
		String mbtiResult = "";
		String userName;
		int userAge;
		
		Scanner input = new Scanner(System.in);

		System.out.print("검사자 이름 입력: ");
		userName = input.nextLine();
		

		System.out.print("검사자 나이 입력: ");
		userAge = input.nextInt();

		System.out.println("============================================\n본 검사지의 질문은 (앞1번) vs (뒤2번)으로 되어있습니다.\n앞이면 1번 뒤면 2번을 누르시면 됩니다.\n============================================");
		System.out.println("E(외향) vs I(내향)");

		
		int E = 0;
		int I = 0;

		System.out.print("1.다양한 활동을 선호하는 편 vs 1.한 가지에 집중하는 편 (press 1 or 2): ");
		int T1 = input.nextInt();
		if (T1 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("2.밖에서 활동하기 좋아하는 편 vs 2.실내에 있기를 좋아한다. (press 1 or 2): ");
		int T2 = input.nextInt();
		if (T2 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("3.말을 많이 하는 편 vs 3. 말을 적게하는 편 (press 1 or 2): ");
		int T3 = input.nextInt();
		if (T3 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("4.말 중간에 잘 끼어드는 편 vs 4.말을 끝까지 잘 듣는 편 (press 1 or 2): ");
		int T4 = input.nextInt();
		if (T4 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("5.성급하다는 말을 듣는 편 vs 5.침착하다는 말을 듣는 편 (press 1 or 2): ");
		int T5 = input.nextInt();
		if (T5 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("6.감정을 솔직하게 표현하는 편 vs 속마음을 잘 드러내지 않는 편 (press 1 or 2): ");
		int T6 = input.nextInt();
		if (T6 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("7.폭넓게 친구를 사귀는 편 vs 7.소수의 친한 친구를 사귀는 편 (press 1 or 2): ");
		int T7 = input.nextInt();
		if (T7 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("8.사람들과 만나는 것을 즐기는 편 vs 8.혼자 있어도 싫지 않은 편 (press 1 or 2): ");
		int T8 = input.nextInt();
		if (T8 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		System.out.print("9.활동적인 취미를 즐기는 편 vs 9.조용한 취미를 즐기는 편 (press 1 or 2): ");
		int T9 = input.nextInt();
		if (T9 == 1) {
			E = E + 1;
		} else {
			I = I + 1;
		}
		String result1 = "E(외향)";
		String result2 = "I(내향)";

		if (I < E) {
			System.out.println(result1);
			mbtiResult += "E";
			// total.add("E");
		} else {
			System.out.println(result2);
			mbtiResult += "I";
			// total.add("I");
		}

		System.out.println("S(감각) vs N(직관)");

		int S = 0;
		int N = 0;

		System.out.print("10.경험에 의존하는 편 vs 10.아이디어에 의존하는 편 (press 1 or 2): ");
		int T11 = input.nextInt();
		if (T11 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("11.현실적인 편 vs 11.미래지향적인 편 (press 1 or 2): ");
		int T12 = input.nextInt();
		if (T12 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("12.확실한 것을 선호하는 편 vs 12.애매해도 참신한 것을 선호하는 편 (press 1 or 2): ");
		int T13 = input.nextInt();
		if (T13 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("13.확인된 사실을 중요시하는 편 vs 13.앞으로의 가능성을 중요시하는 편 (press 1 or 2): ");
		int T14 = input.nextInt();
		if (T14 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("14.세부적인 것을 따지는 편 vs 14.종합적인 큰 그림을 보는 편 (press 1 or 2): ");
		int T15 = input.nextInt();
		if (T15 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("15.실효성이 높은 것을 선호하는 편 vs 15.좋은 명분이 있는 것을 선호하는 편 (press 1 or 2): ");
		int T16 = input.nextInt();
		if (T16 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("16.확실한 데이터를 믿는 편 vs 16.본능적인 느낌을 믿는 편 (press 1 or 2): ");
		int T17 = input.nextInt();
		if (T17 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("17.현상에 대한 개선을 선호하는 편 vs 17.혁신적인 변화를 선호하는 편 (press 1 or 2): ");
		int T18 = input.nextInt();
		if (T18 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}
		System.out.print("18.기능적 실요성을 먼저 보는 편 vs 18.디자인을 먼저 보는 편 (press 1 or 2): ");
		int T19 = input.nextInt();
		if (T19 == 1) {
			S = S + 1;
		} else {
			N = N + 1;
		}

		String result3 = "S(감각)";
		String result4 = "N(직관)";

		if (N < S) {
			System.out.println(result3);
			mbtiResult += "S";
			// total.add("S");
		} else {
			System.out.println(result4);
			mbtiResult += "N";
			// total.add("N");
		}

		System.out.println("T(판단) vs F(인식)");


		int T = 0;
		int F = 0;

		System.out.print("19.원칙대로 하는 편 vs 19.조화를 생각해서 사는 편 (press 1 or 2): ");
		int T21 = input.nextInt();
		if (T21 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("20.내 주장대로 하는 편 vs 20.상대방 입장을 고려하는 편 (press 1 or 2): ");
		int T22 = input.nextInt();
		if (T22 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("21.일 위주로 하는 편 vs 21.관계된 사람 위주로 하는 편 (press 1 or 2): ");
		int T23 = input.nextInt();
		if (T23 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("22.엄격하게 하는 편 vs 22. 상황에 따라 조정하는 편 (press 1 or 2): ");
		int T24 = input.nextInt();
		if (T24 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("23.냉철한 이성으로 판단하는 편 vs 23.내가 공감한 대로 판단하는 편 (press 1 or 2): ");
		int T25 = input.nextInt();
		if (T25 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("24.냉철하다는 말을 듣는 편 vs 24.마음이 따스하다는 말을 듣는 편 (press 1 or 2): ");
		int T26 = input.nextInt();
		if (T26 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("25.따질 것은 따지는 편 vs 25.가능하면 좋게 생각하는 편 (press 1 or 2): ");
		int T27 = input.nextInt();
		if (T27 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("26.빨리 하는 편 vs 26.여유를 가지는 편 (press 1 or 2): ");
		int T28 = input.nextInt();
		if (T28 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}
		System.out.print("27.결과를 중요하게 여기는 편 vs 27.과정을 중요하게 여기는 편 (press 1 or 2): ");
		int T29 = input.nextInt();
		if (T29 == 1) {
			T = T + 1;
		} else {
			F = F + 1;
		}

		String result5 = "T(사고)";
		String result6 = "F(감정)";

		if (F < T) {
			System.out.println(result5);
			mbtiResult += "T";
			// total.add("T");
		} else {
			System.out.println(result6);
			mbtiResult += "F";
			// total.add("F");
		}

		System.out.println("J(판단) vs P(인식)");


		int J = 0;
		int P = 0;

		System.out.print("28.사전에 계획하는 편 vs 28.일단 해가면서 계획하는 편 (press 1 or 2):");
		int T31 = input.nextInt();
		if (T31 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("29.계획대로 하는 편 vs 29.상황에 따라 유연하게 하는 편 (press 1 or 2): ");
		int T32 = input.nextInt();
		if (T32 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("30.끝맺음을 잘하는 편 vs 30.일을 잘하는 편이다. (press 1 or 2): ");
		int T33 = input.nextInt();
		if (T33 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("31.계획이 짜여 있어야 마음이 편하다. vs 31.계획이 없어야 마음이 자유롭다. (press 1 or 2): ");
		int T34 = input.nextInt();
		if (T34 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("32.계획한 것에만 집중하는 편 vs 32.계획에 없던 일도 손을 잘 대는 편 (press 1 or 2): ");
		int T35 = input.nextInt();
		if (T35 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("33.깔끔하게 정돈해놓고 지낸다. vs 33.정리정돈을 뒤로 미룬다. (press 1 or 2): ");
		int T36 = input.nextInt();
		if (T36 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("34.결론을 잘 내리는 편 vs 34.아이디어를 잘 받아들이는 편 (press 1 or 2): ");
		int T37 = input.nextInt();
		if (T37 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("35.정해진 것은 미루지 않는 편 vs 35.미루기도 잘 하는 편 (press 1 or 2): ");
		int T38 = input.nextInt();
		if (T38 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}
		System.out.print("36.목표가 분명한 편 vs 36.목표를 상황에 따라 바꾸는 편 (press 1 or 2): ");
		int T39 = input.nextInt();
		if (T39 == 1) {
			J = J + 1;
		} else {
			P = P + 1;
		}

		String result7 = "J(판단)";
		String result8 = "P(인식)";

		if (P < J) {
			System.out.println(result7);
			mbtiResult += "J";
			// total.add("J");
		} else {
			System.out.println(result8);
			mbtiResult += "P";
			// total.add("P");
		}
		// User 객체 생성 (초기값 / 설정 이름, 나이)
		userList.add(new Users(userName, userAge));
		// TODO: User 객체 생성 (초기값 / 설정 이름, 나이, MBTI Type, MBTI 운동, MBTI 솔루션))
		
		
			// TODO: 검사 받은 유저의 결과물 출력
			System.out.println("이름 : " + userName + " " + " 나이 : " + userAge);
			// 이름, 나이, MBTI Type, MBTI 운동, MBTI 솔루션
            System.out.println("결과 : " + mbtiResult);

		
		// mbtiResult 출력 결과물에 따른 조건식 (16개 조건식)
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

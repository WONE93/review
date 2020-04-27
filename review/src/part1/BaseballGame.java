package part1;

import java.util.Random;
import java.util.Scanner;

//* 암호화와 복호화
//단방향: 암호화만 가능 복호화 불가능 ex) 비밀번호
//양방향 " 암호화 복호화 모두 가능 ex) 생년월일 
//
//
//**야구게임 만들기**
//
//조건 : 10회 이상이면 게임오버
//	10회 이내에 3s 이면 게임종료 
//
//변수 ; com1, com2, com3
//       usr1, usr2, usr3
//	cnt, s, b
//
//수도코드 :
//	컴퓨터가 서로 다른 난수 3개 만듦 (같은 수 x)
//	스트라익 0으로 초기화
//	게임횟수 0으로 초기화
//	스트라익이 3이거나 게임횟수 10  이상이면 게임 종료 아니면 반복
//		스트라익, 볼을 0으로 초기화
//		사용자 숫자 3개 입력
//		같은자리에 같은 수가 있으면 스트라익 증가
//		다른자리에 같은 수가 있으면 볼 증가
//
//	스트라익이 3이면 게임종료 출력하고 아니면 게임오버 출력
//
//if문으로 볼증가
//
//그리고 와일문으로 돌아가서 게임횟수 증가
//게임횟수 10번 되면 빠져나오고

public class BaseballGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BaseballGame game1 = new BaseballGame();
		game1.setNum();

		for (int i = 0; i < 15; i++) {
			game1.getNum(sc.nextInt(), sc.nextInt(), sc.nextInt());

		}
	}

	static int gameCnt = 0;
	static int strCnt = 0;
	static int ballCnt = 0;
	static int ball = 0;
	static int strike = 0;
	static int number1;
	static int number2;
	static int number3;

	// 3개의 랜덤숫자 정답 설정 (0~9)
	public void setNum() {

		boolean stop = false;
		Random random = new Random();

		while (!stop) {
			number1 = random.nextInt(10);
			number2 = random.nextInt(10);
			number3 = random.nextInt(10);

			if ((number2 == number1) || (number2 == number3)) { // 같은 숫자가 있을 경우 재설정
				number2 = random.nextInt(10);
			} else if ((number3 == number1) || (number3 == number2)) {
				number3 = random.nextInt(10);
			} else {
				stop = true;
			}
		}
		System.out.println("******** 숫자 야구게임을 시작합니다! ********");
		System.out.println("( 0 ~ 9사이의 숫자 3개를 입력해주세요. )");

	}

	// user로부터 3개의 입력을 받는 메소드
	public void getNum(int num1, int num2, int num3) {

		strCnt = cntStrike(num1, num2, num3);
		ballCnt = cntBall(num1, num2, num3);
		gameCnt++;

		System.out.println("(" + gameCnt + "번째 시도)");
		System.out.println(
				"입력한 숫자 => " + num1 + ", " + num2 + ", " + num3 + "\t결과 => " + "S: " + strCnt + " /B: " + ballCnt);
		System.out.println("-------------------------------------------");

		checkAns();
	}

	// 3개의 입력의 숫자를 확인하는 메소드
	public static int cntBall(int a, int b, int c) {

		ball = 0;

		if ((a == number2) || (a == number3))
			ball++;
		if ((b == number1) || (b == number3))
			ball++;
		if ((c == number1) || (c == number2))
			ball++;

		return ball;
	}

	// 3개의 입력의 자리수를 확인하는 메소드
	public static int cntStrike(int a, int b, int c) {

		strike = 0;

		if ((a == number1))
			strike++;
		if (b == number2)
			strike++;
		if (c == number3)
			strike++;

		return strike;
	}

	// 정답 체크하는 메소드
	public static void checkAns() {

		if (gameCnt >= 10) {
			System.out.println("<<<<<<<<<<<<<< Game OVER !! >>>>>>>>>>>>>>>"); // gameCnt(게임시도횟수)가 10회이상이면 게임오버
			System.out.printf("정답은 %d, %d, %d였습니다.", number1, number2, number3);
		} else if (strCnt == 3) {
			System.out.println("======= Game WIN!! 정답을 맞추셨습니다. =======");
			// strCnt가 3개이면 게임 우승.
		}
	}

} // Class Ended
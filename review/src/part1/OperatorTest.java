package part1;

/*
 * 연산자  Chapter 3
*/
public class OperatorTest {
	
	public static void main(String[] args) {
		//삼항연산
		int score = 80;
		String grade = score >= 60 ? "success" : "fail";
		boolean booleangrade = score >= 60 ? true : false;
		char chargrade =  score >= 90 ? 'a' : score >=80 ? 'b' : 'c'; // 90> a 80> b 
		System.out.println(chargrade);
		
		//증감
		int a = 5;
		int b = 10;
		int c = a++ + ++b;
//		System.out.println(a + "," +b+ "," +c);
		System.out.println(String.format("%4d,%4d,%4d", a,b,c));
		
		//논리(&& || !)  a가 10 ~ 20 인지 검사
		boolean b1 = a >= 5 && a <= 20;
		System.out.println("논리연산: " +b1);
		
		boolean b2 = !(a >= 5 && a <= 20);
		System.out.println("논리연산: " +b2);
		
		//a와 b가 모두 10~20사이인지
//		boolean b3 = a>=10 && a<=20 && b>=10 && b<=20;
		boolean b3 = a<=b && a>=10 && b<=20;
		System.out.println(b3);
		
		Integer inta = 10;
		Integer intb = null;
		b1 = inta>=10 || intb>=20;
	}

}

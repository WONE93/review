package part1;

/*
 * 1장내용
* 데이터타입, 상수타입
*/
public class VarTest {
	
	public static void main(String[] args) {
		//정수형 진수

		System.out.println((int)'\uac00'); 
		char d1 = 0xAC00;
		System.out.println(d1); // '가' 출력
		
		int num = 0xff;
		int num1 = 0x10;  //16
		int num2 = 010;	  //8
		int num3 = 10;
		System.out.println( String.format("%5d %5d %5d %5d", num,num1,num2,num3) );
		
		
		//8가지 byte, short, int, long, 
		//					float(소수점7자리), double(대정밀도, 소수점15자리), 
		//					boolean, char
		System.out.println(Byte.MAX_VALUE); 
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		// Max값 오버되면 -값이 나온다
		//BigDecimal (long int보다 더 큰 것)
		
		//실수 -> 유효자리 
		//0.00001 -> 1*10^6 
		//100000 1*10^6
		//0.12345678 ->1.2345678 * 10^-7
		float fnum = 0.123456789f; //실수값은 기본이 더블이라 float시 f표시 해줘야한다   7자리까지
		System.out.println(fnum);
		double dnum = 0.123456789; // 15자리까지 표현가능
		System.out.println(dnum);
		
		//char -> 유니코드 
		char c = '가';
		System.out.println("가의 int: " +(int)c);
		System.out.println("가의 16진수: " +Integer.toHexString((int)c));
		
		//유니코드 찍어보기
		char c1 = '\uac01';
		System.out.println("유니코드\uac01: " +c1);

		// 65  97
		char c2 = 'A';
		System.out.println( (char)(c2+32) ) ; // 소문자 표현법
		
		for(int i=0; i<127; i++) {
//			System.out.println(i+ "\t" +(char)i);
		}
		
		//상수 타입
//		int double 
		long lnum = 1000000000000L; 
		//Float와 같은 개념(기본이더블)으로 기본이 int라서  접미어 붙여서 long이라는 걸 알려줘야 오류가 없음
		
		
		
	}

}

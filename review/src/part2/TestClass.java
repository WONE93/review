package part2;

import java.util.Calendar;

public class TestClass {
	
	public static void main(String[] args) {
//		2. 객체생성
//		PrintClass pc = new PrintClass();
//		3. static으로 정의된 메소드 호출
		//인수도 없고 리턴값도 없는 메서드
		PrintClass.print();
		//인수가 있는 경우
		PrintClass.print("*");
		//인수가 있는 경우 length까지 지정
		PrintClass.print("#", 5);
		
//		PrintClass pc1 = new PrintClass();
//		3. 연산자 필드나 메서드 호출
//		pc1.print();
		
		//SumClass 호출.  return값까지 지정
		int result = SumClass.total(2, 2);
		System.out.println(result);
		
		// 값만 받아오는 거라 a ,b형식 지키지 않아도 됨
		int num1 = 10;
		int num2 = 20;
		int result2 = SumClass.total(num1, num2);
		System.out.println(result2);
		
		//int 개수 무제한
		System.out.println(SumClass.total2(num1,num2,1,9));
		
		//오늘 날짜를 y/m/d 스트링 리턴
		String today = DateUtil.today();
		System.out.println(today);
		
		//날자만 받아오기
		Calendar birthDay = Calendar.getInstance();
//		birthDay.set(2000, 11, 25); ->set하면 한달뒤로나옴
		String birth = DateUtil.strDate(birthDay.getTime());
		System.out.println(birth);
		//포멧까지지정
		String birth2 = DateUtil.strDate(birthDay.getTime(), "yyyy/MM");
		System.out.println(birth2);
	}
	
	
	
}

package part2;
//1. 클래스 정의

public class PrintClass {
	
	public static void print() {
		for(int i=0; i<20; i++) {
			System.out.println("=");
		}
		System.out.println("");
	}
	//인수도 없고 리턴값도 없는 메서드
	public static void print(String shape) {
		for(int i=0; i<20; i++) {
			System.out.println(shape);
		}
		System.out.println("");
	}
	//인수가 있는 경우 length 지정
	public static void print(String shape, int length) {
		for(int i=0; i<length; i++) {
			System.out.println(shape);
		}
		System.out.println("");
	}
	
}

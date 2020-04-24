package part1;

public class OperatorTest2 {

		public static void main(String[] args) {
			
			int a = 5 + 6 + 7;
			int b, c;
			a = b = c = 10; //증감, 대입 연산자는 오른쪽에서 시작 
			
			a = 0;
//				5						4
//				4						3
			b = a++  +  ++a  +  ++a  +  a++  +  ++a ;
//					 	 3		2				1
			
			c = a++ + ++a - ++a + a++ - ++a;
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
}

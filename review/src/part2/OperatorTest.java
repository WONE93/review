package part2;

public class OperatorTest {
	
	public static void main(String[] args) {
		//객체생성
		OperatorClass op = new OperatorClass();
		//숫자값 지정
		op.setNum(10,20); //num1, num2 초기화
		//합계구함
		int result = op.sum(); // 두 수의 합을 리턴해준다
		System.out.println(result);
	}
}

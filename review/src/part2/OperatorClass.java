package part2;

public class OperatorClass {
	private int num1;
	private int num2;
	private int result;
	
	public void setNum(int n1, int n2) {
		this.num1 = n1;
		this.num2 = n2;
	}
	
	public int sum() {
		return this.result = num1+num2;
	}
}

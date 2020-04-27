package part2;

public class SumClass {
	
	public static int total(int a, int b) {
		int c = a+b;
		return c;
	}
	
	//인트 개수 무제한 arr은 배열이라 for문 돌려야함
	public static int total2( int ... arr ) {
		int c = 0;
		for(int i=0; i<arr.length; i++) {
			c += arr[i];
		}
		return c;
	}

}

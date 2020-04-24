package review.wrap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
	public static void main(String[] args) {
		
		//검색
		String path = "c:/app/images/pig.jpg"; // 4개의 스트링 배열 
		
		//1. 맨끝의 / 의 위치 (lastindexof)
		int idx = path.lastIndexOf("/");
		System.out.println("맨 끝의 위치: " +idx);
		
	
		//2. 파일명만 추출 lastindexof , substring
		String filename = path.substring(idx+1);
		System.out.println("파일명만 출력:" +filename);
		
		//3. 파일이 jpg로 끝나는지 ?  endWith 함수 사용하면됨. startWith함수도있음
		boolean jpgyn = path.endsWith("jpg");
		System.out.println("파일형식이 jpg인가요? " +jpgyn);
		
		//4. 문자열 자르기  split으로 자르고 배열로 나열
		String[] paths = path.split("/");
		System.out.print("\"/\"기준으로 문자열 자르기-> ");
		for(String p : paths) {
			System.out.print(p + " ");
		}
		System.out.println(" ");
		
		//패턴 체크 (대소특 8자리)
		String pattern = "\"^(?=.*[A-Za-z]) (?=.*\\d) (?=.*[$@$!%*#?&]) [A-Za-z\\d$@$!%*#?&]{8,}$\""; //자리 8자리이상
		String pw = "ffGikelke4pa855!"; 
		boolean result = validationPasswd(pw, pattern);
		System.out.println("패턴검사: " + result);
		

	}// E of main 
	
	private static boolean validationPasswd(String pw, String pattern){
	    Pattern p = Pattern.compile(pattern);
	    Matcher m = p.matcher(pw);

	    if(m.matches()){
	        return true;
	    }
	    return false;
	}
} // E of class

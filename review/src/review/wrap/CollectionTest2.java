package review.wrap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionTest2 {
	
	public static void main(String[] args) {
		ArrayList<MemberVO> list = new ArrayList<>();
		list.add(new MemberVO("100","홍길동")); 
		list.add(new MemberVO("103","권율")); 
		list.add(new MemberVO("102","김유신")); 
		
		
	//얘들은 과제 2가지
//1.	//List -> Set
//		Set<E>
		
//2.	//Set -> List
		
//		//List<VO> 필드로 검색, 정렬
//		Collections.sort(list, new Comparator<MemberVO>() {
//
//			@Override
//			public int compare(MemberVO o1, MemberVO o2) {
//				return o1.getUserid().compareTo(o2.getUserid());
//			}
//		});
//		System.out.println(list);
//	} // E OF COLLECTION.SORT
		
		
		//List<VO> 필드로 검색, 정렬  ->람다식으로 
		Collections.sort(list, (o1, o2) ->
				 o1.getUserid().compareTo(o2.getUserid()));
			
		System.out.println("정렬" +list );
		
		//역순 reverse
		Collections.reverse(list);
	
		System.out.println("역순" +list );
		
		//섞기 shuffle
		Collections.shuffle(list );
		System.out.println("섞기" +list);
		
	} // E OF COLLECTION.SORT
}

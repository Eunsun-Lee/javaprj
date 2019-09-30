package test3.예시;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxingProgram {
	public static void main(String[] args) {

		// 배열의 대체제

		// 데이터를 식별하는 방법에 차이를 두고 있는 계열
		// 1. 데이터가 곧 식별자다 => set 계열
		Set set = new HashSet();
		set.add("hello");
		set.add(37);
		set.add("호호호");
		set.add(37); // 중복 불가 /중복제거용
		set.add("호호호");

//		for(Object obj : set)
//			System.out.println(obj);

		// 2. 데이터의 순서가 곧 식별자다 => list 계열 add, get을 통해 넣고 읽어올수있움
		List list = new ArrayList(); // 순서대로 집어넣음
		list.add("hello"); // 1번째 [0]
		list.add(37); // [1]
		list.add("호호호"); // [2]
		list.add(37);
		list.add("호호호"); // 중복가능

		list.size();
//		for(int i = 0 ; i <list.size();i++)
//			System.out.println(list.get(i));
//		for(Object obj : list) // 같은 내용 // 열거하는 서비스를 가지고 있는 친구들만 쓸수있움
//			System.out.println(obj);

//		System.out.println(list.get(0));
		// 3. 데이터의 식별자가 따로있다 => Map개열
		Map map = new HashMap();
		map.put("이름", "홍길동");
		map.put("나이", "17");
		map.put("주소", "한양"); //
		map.put("kor", 20);
		map.put("eng", 80);
		map.put("math", 50); //

//		System.out.println(map.get("주소"));

		//
		for (Object k : map.keySet())
			System.out.printf("k : %s, value : %s\n", k, map.get(k));
		
		// Generic - 무엇이든 될 수 있는 클래스
		// 
		
	}
}

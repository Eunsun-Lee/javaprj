package test3.����;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxingProgram {
	public static void main(String[] args) {

		// �迭�� ��ü��

		// �����͸� �ĺ��ϴ� ����� ���̸� �ΰ� �ִ� �迭
		// 1. �����Ͱ� �� �ĺ��ڴ� => set �迭
		Set set = new HashSet();
		set.add("hello");
		set.add(37);
		set.add("ȣȣȣ");
		set.add(37); // �ߺ� �Ұ� /�ߺ����ſ�
		set.add("ȣȣȣ");

//		for(Object obj : set)
//			System.out.println(obj);

		// 2. �������� ������ �� �ĺ��ڴ� => list �迭 add, get�� ���� �ְ� �о�ü��ֿ�
		List list = new ArrayList(); // ������� �������
		list.add("hello"); // 1��° [0]
		list.add(37); // [1]
		list.add("ȣȣȣ"); // [2]
		list.add(37);
		list.add("ȣȣȣ"); // �ߺ�����

		list.size();
//		for(int i = 0 ; i <list.size();i++)
//			System.out.println(list.get(i));
//		for(Object obj : list) // ���� ���� // �����ϴ� ���񽺸� ������ �ִ� ģ���鸸 �����ֿ�
//			System.out.println(obj);

//		System.out.println(list.get(0));
		// 3. �������� �ĺ��ڰ� �����ִ� => Map����
		Map map = new HashMap();
		map.put("�̸�", "ȫ�浿");
		map.put("����", "17");
		map.put("�ּ�", "�Ѿ�"); //
		map.put("kor", 20);
		map.put("eng", 80);
		map.put("math", 50); //

//		System.out.println(map.get("�ּ�"));

		//
		for (Object k : map.keySet())
			System.out.printf("k : %s, value : %s\n", k, map.get(k));
		
		// Generic - �����̵� �� �� �ִ� Ŭ����
		// 
		
	}
}

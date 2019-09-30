package 가변배열;
// 직접 만들었었음
// ┌<자바>특징 ┐
//0. 완전한 객체지향 API(객체)
// 1. 간결성
// 2. 컬렉션지원
// -> 자바+컬렉션
// 컬렉션 : 키가 다름
//set : 키가 없다 
//list : 순서가 키다  ->가변배열
//map : 별도의 키가 있다. ->임시데이터 객체

// 컬렉션은 모두 Generic 클래스다. -> 특정 자료형으로 한정할 수 있다.

public class ObjectList {
	private Object[] data;
	private int index;
	private int max;

	public ObjectList() {
		max = 3;
		index = 0;
		data = new Object[max];
	}

	public int size() {
		return index;
	}

	public void add(Object value) {
		if (index >= max/* data.length, 저장공간이없다면 */) {
			// 공간늘려주기
			// 1. 이주할 임시배열 temp를 생성 크기(max+5)
			Object temp[] = new Object[max + 5];
			// 2. 기존 data배열의 값을 temp배열에 옮긴다
			for (int i = 0; i < data.length/*max*/; i++)
				temp[i] = data[i];
			// 3. temp배열의 이름을 data라는 이름으로 변경한다
			data = null; // data안의 값을 없어지게하고
			data = new Object[max+5]; // 다시 큰 칸으로 만들기
			for (int i = 0; i < data.length; i++)
				data[i] = temp[i]; // temp꺼 주기
			// data = temp; └ 같은거
			
			// 4. max의 값을 +5 증가시킨다
			max +=5; // 위에서 max를 사용하기위해 마지막에 증가시켜줌
			temp = null;
		}
		data[index] = value;
		index++;
	}

	public Object get(int index) {

		return data[index];
	}

}

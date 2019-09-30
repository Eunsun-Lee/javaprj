package 가변배열;
 // 바뀔 클래스 <T>
public class GList <T>{
	private T[] data;
	private int index;
	private int max;

	public GList() {
		max = 3;
		index = 0;
		data = (T[]) new Object[max]; // 꼭 Object를 써줘야하므로 대신 형변환을 해줘야함
	}

	public int size() {
		return index;
	}

	public void add(T value) {
		if (index >= max/* data.length, 저장공간이없다면 */) {
			// 공간늘려주기
			// 1. 이주할 임시배열 temp를 생성 크기(max+5)
			T temp[] = (T[]) new Object[max + 5];
			// 2. 기존 data배열의 값을 temp배열에 옮긴다
			for (int i = 0; i < data.length/*max*/; i++)
				temp[i] = data[i];
			// 3. temp배열의 이름을 data라는 이름으로 변경한다
			data = null; // data안의 값을 없어지게하고
			data = (T[]) new Object[max+5]; // 다시 큰 칸으로 만들기
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

	public T get(int index) {

		return data[index];
	}

}

package �����迭;
 // �ٲ� Ŭ���� <T>
public class GList <T>{
	private T[] data;
	private int index;
	private int max;

	public GList() {
		max = 3;
		index = 0;
		data = (T[]) new Object[max]; // �� Object�� ������ϹǷ� ��� ����ȯ�� �������
	}

	public int size() {
		return index;
	}

	public void add(T value) {
		if (index >= max/* data.length, ��������̾��ٸ� */) {
			// �����÷��ֱ�
			// 1. ������ �ӽù迭 temp�� ���� ũ��(max+5)
			T temp[] = (T[]) new Object[max + 5];
			// 2. ���� data�迭�� ���� temp�迭�� �ű��
			for (int i = 0; i < data.length/*max*/; i++)
				temp[i] = data[i];
			// 3. temp�迭�� �̸��� data��� �̸����� �����Ѵ�
			data = null; // data���� ���� ���������ϰ�
			data = (T[]) new Object[max+5]; // �ٽ� ū ĭ���� �����
			for (int i = 0; i < data.length; i++)
				data[i] = temp[i]; // temp�� �ֱ�
			// data = temp; �� ������
			
			// 4. max�� ���� +5 ������Ų��
			max +=5; // ������ max�� ����ϱ����� �������� ����������
			temp = null;
		}
		data[index] = value;
		index++;
	}

	public T get(int index) {

		return data[index];
	}

}

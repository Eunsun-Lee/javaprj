package �����迭;
// ���� ���������
// ��<�ڹ�>Ư¡ ��
//0. ������ ��ü���� API(��ü)
// 1. ���Ἲ
// 2. �÷�������
// -> �ڹ�+�÷���
// �÷��� : Ű�� �ٸ�
//set : Ű�� ���� 
//list : ������ Ű��  ->�����迭
//map : ������ Ű�� �ִ�. ->�ӽõ����� ��ü

// �÷����� ��� Generic Ŭ������. -> Ư�� �ڷ������� ������ �� �ִ�.

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
		if (index >= max/* data.length, ��������̾��ٸ� */) {
			// �����÷��ֱ�
			// 1. ������ �ӽù迭 temp�� ���� ũ��(max+5)
			Object temp[] = new Object[max + 5];
			// 2. ���� data�迭�� ���� temp�迭�� �ű��
			for (int i = 0; i < data.length/*max*/; i++)
				temp[i] = data[i];
			// 3. temp�迭�� �̸��� data��� �̸����� �����Ѵ�
			data = null; // data���� ���� ���������ϰ�
			data = new Object[max+5]; // �ٽ� ū ĭ���� �����
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

	public Object get(int index) {

		return data[index];
	}

}

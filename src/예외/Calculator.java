package ����;
// ���� : ���������� �߻��ϴ� ����
// ���� : ��������, ������, ���ܿ���

// ���ܿ����� API�� ����
// ���ܿ����� App�� ó�� -> ���ܿ����� �߸��� �ڵ带 �����ϴ� ���� �ƴ϶� �̹� �߻��� ���� ����ų ���� ���� �޽����� �����ϰ� ���̴� ���� ����ó���̴�.
// 1. �޽��� ������
// 2. ��� �̾ ������ ���������� ����
// �������� ���� ���� ���� throws
public class Calculator {
	public static int add(int x, int y) throws �ѳ�ŭ���� {
		int result = x + y ;
		
		if(result>10000) {
			// ���ܹ߻� , �ʹ� Ŀ�� ��ȯ�Ҽ� ����
			throw new �ѳ�ŭ����();
		}
		return result;
	}
	public static int sub(int x, int y) {
		int result = x - y ; 
		return result;
	}
	public static int div(int x, int y) {
		int result = x / y ; 
		return result;
	}
}

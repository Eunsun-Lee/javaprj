package ����;

public class Program {
	public static void main(String[] args) /* throws �ѳ�ŭ���� */ {
		try { // ���ܴ� �������߻��Ҽ��ִ� (����ó��, �ϰ�ó��)
			Thread.sleep(1000);
			int sum = Calculator.add(10004, 3);
			System.out.println("sum : " + sum);
		} catch (�ѳ�ŭ���� e) {
			System.out.println("aaa : " + e.getMessage());
		} // +catch����ó��
		catch (Exception aaa) { // �ϰ�ó��
			System.out.println("�˼��մϴ�. ����ġ �ʰ� ������ �߻��Ͽ����ϴ�.\n" + "����Ŀ� �ٽ� �õ����ֽʽÿ�");
		} // Ư���ϰ� ����ó���� �Ϸ��� ���ʿ�, ���ʿ��� �ϰ�ó��
		finally {
			// ������ �ݾƾ��ϴ� �ڵ�
			System.out.println("finally");
		}
		System.out.println("����Ǿ���?"); // ���� ���� ���� ��������ʰ� �����̵�
	}
	// ���ܴ��ϸ� ���� ���ᰡ �� -> ����ó���� ������ϴ� ����
}
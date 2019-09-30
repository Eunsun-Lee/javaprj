package 예외;

public class Program {
	public static void main(String[] args) /* throws 넘나큼예외 */ {
		try { // 예외는 여러개발생할수있다 (개별처리, 일괄처리)
			Thread.sleep(1000);
			int sum = Calculator.add(10004, 3);
			System.out.println("sum : " + sum);
		} catch (넘나큼예외 e) {
			System.out.println("aaa : " + e.getMessage());
		} // +catch개별처리
		catch (Exception aaa) { // 일괄처리
			System.out.println("죄송합니다. 예기치 않게 오류가 발생하였습니다.\n" + "잠시후에 다시 시도해주십시오");
		} // 특수하게 개별처리를 하려면 앞쪽에, 뒤쪽에는 일괄처리
		finally {
			// 파일을 닫아야하는 코드
			System.out.println("finally");
		}
		System.out.println("종료되었나?"); // 오류 이후 완전 종료되지않고 실행이됨
	}
	// 예외당하면 강제 종료가 됨 -> 예외처리를 해줘야하는 이유
}
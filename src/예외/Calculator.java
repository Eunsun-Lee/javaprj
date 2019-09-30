package 예외;
// 예외 : 예외적으로 발생하는 오류
// 오류 : 구문오류, 논리오류, 예외오류

// 예외오류는 API가 검진
// 예외오류는 App이 처리 -> 예외오류는 잘못된 코드를 수정하는 것이 아니라 이미 발생한 것은 돌이킬 수는 없고 메시지라도 정갈하게 보이는 것이 예외처리이다.
// 1. 메시지 재정의
// 2. 계속 이어갈 것인지 말것인지를 결정
// 여러개의 예외 오류 통제 throws
public class Calculator {
	public static int add(int x, int y) throws 넘나큼예외 {
		int result = x + y ;
		
		if(result>10000) {
			// 예외발생 , 너무 커서 반환할수 없음
			throw new 넘나큼예외();
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

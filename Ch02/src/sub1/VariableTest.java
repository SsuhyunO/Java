package sub1;

/*
 * 
 * 날짜 : 2026/04/27 
 * 이름 : 오수현
 * 내용 : 2장 Java 변수 실습
 * 
 */

public class VariableTest {

	public static void main(String[] args) {
		
		// 변수(variable)
		int a = 1;	// 변수 선언과 초기화
		int b = 3;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		a = 4;		// 재할당
		b = 7;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		// 상수(Constance) - 한 번 초기화된 값으로 고정된 변수, 대문자로 변수
		final int NUM = 5;	
		
		System.out.println("NUM : " + NUM );
	}
}

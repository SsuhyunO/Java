package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * 날짜 : 2026/05/11 
 * 이름 : 오수현
 * 내용 : Java Throws 예외 던지기 실습
 * 
 */
public class ThrowsTest {
	public static void main(String[] args) {
		try {
			method1();
		} catch (InputMismatchException e) {
			System.out.println("1.예외발생! " + e);
		} catch (ArithmeticException e) {
			System.out.println("2.예외발생! " + e);
		}		
		System.out.println("프로그램 정상 종료...");
	}
	
	public static void method1() throws InputMismatchException, ArithmeticException{
		// method2에서 발생하는 Exception을 method1을 호출하는 쪽으로 던짐
		method2();
	}
	
	public static void method2() throws InputMismatchException, ArithmeticException{ 
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");

		int num = scan.nextInt(); // InputMismatchException 발생
		
		int result = 10 / num; // ArithmeticException 발생
		
		System.out.println("number : " + num);
	}
}

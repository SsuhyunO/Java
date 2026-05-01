package ch06.prob20;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		BankApplication BA = new BankApplication();
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("\n-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			String option = sc.nextLine();
			switch (option) {
				case "1":
					System.out.println("-----------");
					System.out.println("계좌생성");
					System.out.println("-----------");
					System.out.print("계좌번호: ");
					String number = sc.nextLine();
					System.out.print("계좌주: ");
					String name = sc.nextLine();
					System.out.print("초기임금액: ");
					int amount = Integer.parseInt(sc.nextLine());
					BA.produce(number, name, amount);
					break;
				case "2":
					System.out.println("-----------");
					System.out.println("계좌목록");
					System.out.println("-----------");
					BA.list();
					break;
				case "3":
					System.out.println("-----------");
					System.out.println("예금");
					System.out.println("-----------");
					System.out.print("계좌번호: ");
					String number2 = sc.nextLine();
					System.out.print("예금액: ");
					int amount2 = Integer.parseInt(sc.nextLine());
					BA.deposit(number2, amount2);
					break;
				case "4":
					System.out.println("-----------");
					System.out.println("출금");
					System.out.println("-----------");
					System.out.print("계좌번호: ");
					String number3 = sc.nextLine();
					System.out.print("출금액: ");
					int amount3 = Integer.parseInt(sc.nextLine());
					BA.withdraw(number3, amount3);
					break;
				case "5":
					System.out.println("프로그램 종료");
					sc.close();
					return;
			}
		}
	}
}

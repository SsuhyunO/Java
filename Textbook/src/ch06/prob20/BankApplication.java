package ch06.prob20;

public class BankApplication {
	public static Account[] arr = new Account[100];
	private static int num;
	
	public BankApplication() {};
	
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		BankApplication.num = num;
	}
	
	public static int exist(String number) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == null) break;
			if((arr[i].getNumber()).equals(number)) return i;
		}
		return -1;
	}
	
	public void produce(String number, String name, int amount) {
		if(num < 100 && BankApplication.exist(number) == -1) {
			arr[num] = new Account(number, name, amount);
			System.out.println("결과: 계좌가 생성되었습니다.");
			num++;
		}else {
			System.out.println("결과: 계좌 생성 실패하였습니다.");
		}
	}
	
	public void list() {
		for(Account ac:arr) {
			if(ac == null) break;
			else System.out.println(ac.getNumber() + "\t" + ac.getName() + "\t" + ac.getAmount());
		}
	}
	
	public void deposit(String number, int amount) {
		int index = BankApplication.exist(number);
		if(BankApplication.exist(number) == -1) {
			System.out.println("결과: 올바른 계좌가 아닙니다.");
		}else {
			arr[index].setAmount(arr[index].getAmount()+amount);
		}
	}
	
	public void withdraw(String number, int amount) {
		int index = BankApplication.exist(number);
		if(index == -1) {
			System.out.println("결과: 올바른 계좌가 아닙니다.");
		}else {
			if(arr[index].getAmount() < amount) {
				System.out.println("결과: 계좌 잔액이 부족합니다.");
			}else {
				arr[index].setAmount(arr[index].getAmount()-amount);
				System.out.println("결과: 출금이 성공되었습니다.");
			}
		}
	}
}

package ch06.prob20;

public class Account {
	private String number;
	private String name;
	private int amount;
	private boolean isPro;
	
	Account(String number, String name, int amount){
		this.number = number;
		this.name = name;
		this.amount = amount;
		this.setIsPro(true);
	}
	
	public int getAmount() {
		return amount;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public boolean IsPro() {
		return isPro;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setIsPro(boolean isPro) {
		this.isPro = isPro;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}

package ch06.sec10;

public class Television {
	static String company = "My Company";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}

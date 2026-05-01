package ch06.prob18;

public class ShopService {
	private static ShopService shopservice = new ShopService();
	
	private ShopService() {};
		
	public static ShopService getInstance() {
		return shopservice;
	}
}

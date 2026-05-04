package sub5;

public class Truck extends Car{
	
	private int capacity;
	private final int MAX_SPEED = 160;
	
	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity = capacity;
	}
	
	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		
		if(speed > MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}

	public void show() {
		System.out.println("차랑명 : " + name);
		System.out.println("차량색 : " + color);
		System.out.println("적재량 : " + this.capacity);
		System.out.println("현재속도 : " + speed);
	}
	
}

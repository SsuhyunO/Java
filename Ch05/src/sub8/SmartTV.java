package sub8;

public class SmartTV extends TV implements Internet, Computer{

	@Override
	public void connection() {
		System.out.println("인터넷 접속...");
	}

	@Override
	public void surf() {
		System.out.println("인터넷 탐색...");
	}

	@Override
	public void process() {
		System.out.println("SmartTV processing...");
	}

	@Override
	public void save() {
		System.out.println("SmartTV saved...");
	}
}

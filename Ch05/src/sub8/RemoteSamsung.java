package sub8;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Sanmsung - powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("Sanmsung - powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("Sanmsung - chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("Sanmsung - chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("Sanmsung - soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("Sanmsung - soundDown...");
	}

}

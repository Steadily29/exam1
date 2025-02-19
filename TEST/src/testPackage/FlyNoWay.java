package testPackage;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날지 못해요.");
		System.out.printLn("노우");
	}

}

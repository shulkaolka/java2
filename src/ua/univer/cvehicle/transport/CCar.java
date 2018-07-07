package ua.univer.cvehicle.transport;

public class CCar extends CVehicle implements iRideAble{

	public CCar(int x, int y, double price, double speed, double yearBirth) {
		super(x, y, price, speed, yearBirth);
	}

	@Override
	public String toString() {
		return "CCar" + super.toString();
	}

}

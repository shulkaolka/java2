package ua.univer.cvehicle.transport;

public abstract class CVehicle {
	private int x, y;
	private double price, speed, yearBirth;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getYearBirth() {
		return yearBirth;
	}

	public void setYearBirth(double yearBirth) {
		this.yearBirth = yearBirth;
	}

	// Set coordinate
	public void setCoordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public CVehicle(int x, int y, double price, double speed, double yearBirth) {
		super();
		this.x = x;
		this.y = y;
		this.price = price;
		this.speed = speed;
		this.yearBirth = yearBirth;
	}

	public CVehicle() {
		super();
		this.x = 0;
		this.y = 0;
		this.price = 0;
		this.speed = 0;
		this.yearBirth = 0;
	}

	@Override
	public String toString() {
		return " coordinate [x=" + x + ", y=" + y + "], price=" + price + ", speed=" + speed + ", yearBirth="
				+ yearBirth;
	}

}

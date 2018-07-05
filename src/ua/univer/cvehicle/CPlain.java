package ua.univer.cvehicle;

public class CPlain extends CVehicle {
	private double height;
	private int numberPass;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getNumberPass() {
		return numberPass;
	}

	public void setNumberPass(int numberPass) {
		this.numberPass = numberPass;
	}

	public CPlain() {
		super();
	}

	public CPlain(int x, int y, double price, double speed, double yearBirth, double height, int numberPass) {
		super(x, y, price, speed, yearBirth);
		setHeight(height);
		setNumberPass(numberPass);
	}

	@Override
	public String toString() {
		return "CPlain" + super.toString() + ", height=" + height + ", numberPass=" + numberPass;
	}

}

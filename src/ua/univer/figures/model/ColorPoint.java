package ua.univer.figures.model;

public class ColorPoint extends Point implements IColorAble {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		setColor(color);
	}

	@Override
	public String toString() {
		return "ColorPoint [Color = " + getColor() + ", " + super.toString() + "]";
	}

}

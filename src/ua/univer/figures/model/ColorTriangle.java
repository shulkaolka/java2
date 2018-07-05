package ua.univer.figures.model;

public class ColorTriangle extends Triangle implements IColorAble{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColorTriangle(int x1, int y1, int x2, int y2, int x3, int y3, String color) {
		super(x1, y1, x2, y2, x3, y3);
		setColor(color);
	}

	public ColorTriangle(Line lineAB, Line lineBC, Line lineAC, String color) {
		super(lineAB, lineBC, lineAC);
		setColor(color);
	}

	public ColorTriangle(Point a, Point b, Point c, String color) {
		super(a, b, c);
		setColor(color);
	}

	@Override
	public String toString() {
		return "ColorTriangle [Color = " + getColor() + ", " + super.toString() + "]";
	}

}

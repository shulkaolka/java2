package ua.univer.figures.model;

public class Triangle extends Figure{

	private Line LineAB;
	private Line LineBC;
	private Line LineAC;

	public Line getLineAB() {
		return LineAB;
	}

	public void setLineAB(Line lineAB) {
		LineAB = lineAB;
	}

	public Line getLineBC() {
		return LineBC;
	}

	public void setLineBC(Line lineBC) {
		LineBC = lineBC;
	}

	public Line getLineAC() {
		return LineAC;
	}

	public void setLineAC(Line lineAC) {
		LineAC = lineAC;
	}

	public Triangle(Point a, Point b, Point c) {
		super();
		LineAB = new Line(a, b);
		LineBC = new Line(b, c);
		LineAC = new Line(a, c);
	}

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		super();
		LineAB = new Line(x1, y1, x2, y2);
		LineBC = new Line(x2, y2, x3, y3);
		LineAC = new Line(x1, y1, x3, y3);
	}

	public Triangle(Line lineAB, Line lineBC, Line lineAC) {
		super();
		LineAB = lineAB;
		LineBC = lineBC;
		LineAC = lineAC;
	}

	@Override
	public String toString() {
		return "Triangle [Line AB = " + LineAB + ", Line BC = " + LineBC + ", Line AC = " + LineAC + "]";
	}

}

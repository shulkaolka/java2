package ua.univer.figures.model;

public class Line extends Figure{
	private Point Start;
	private Point End;

	public Point getStart() {
		return Start;
	}

	public void setStart(Point start) {
		Start = start;
	}

	public Point getEnd() {
		return End;
	}

	public void setEnd(Point end) {
		End = end;
	}

	@Override
	public String toString() {
		return "Line [Start= " + Start + ", End= " + End + "]";
	}

	public Line(Point start, Point end) {
		super();
		Start = start;
		End = end;
	}

	public Line(int x1, int y1, int x2, int y2) {
		Start = new Point(x1, y1);
		End = new Point(x2, y2);
	}
}

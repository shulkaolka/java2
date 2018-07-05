package ua.univer.figures.model;

public class PolyGon {
	private Point [] points;
	public PolyGon() {
		this(3);
	}
	public PolyGon(int n) {
		points = new Point[n];
	}
}

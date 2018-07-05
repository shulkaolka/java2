package ua.univer.figures.model;


public abstract class Figure {
	public static int id;
	private int curID;
	public Figure() {
		curID = id++;
		}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Figure.id = id;
	}
	@Override
	public String toString() {
		return "Figure [curID=" + curID + "]";
	}
	
	

}

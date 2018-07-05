package ua.univer.figures.helper;

import ua.univer.figures.model.*;
public class FactoryFigure extends AbstractFactoryFigure{
	private final static int COUNT_OF_FIGURE = 4;
	public  Figure randFigure() {
		return getFigure((int)(Math.random()*COUNT_OF_FIGURE));
	}
	public  Figure getFigure(int n) {
		switch (n) {
		case 0:
			return new Point (1,1);
		case 1:
			return new ColorPoint (1,1,"red");
		case 2:
			return new Line (1,1,2,2);
		case 3:
			return new ColorLine (1,1,2,2, "green");
		default: return null;
		}
	}
}

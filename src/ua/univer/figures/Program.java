package ua.univer.figures;

import java.util.Arrays;

import ua.univer.figures.helper.*;
import ua.univer.figures.model.*;

public class Program {
	public static void test() {
		Menu menu = new Menu();
		menu.runMenu();
		Point p1 = new Point(1, 1);
		Point p2 = new Point();
		Point p3 = new Point(2, 2);

		System.out.println(p1);
		System.out.println(p2);
		ColorPoint cp1 = new ColorPoint(2, 2, "red");
		System.out.println(cp1);
		Line l1 = new Line(p1, p2);
		System.out.println(l1);

		ColorLine cl1 = new ColorLine(1, 2, 3, 4, "green");
		System.out.println(cl1);
		Triangle tr1 = new Triangle(0, 0, 1, 1, 2, 2);
		System.out.println(tr1);
		Triangle tr2 = new Triangle(p1, p2, p3);
		System.out.println(tr2);
		Triangle tr3 = new Triangle(l1, l1, l1);
		System.out.println(tr3);
		ColorTriangle ctr1 = new ColorTriangle(p1, p2, p3, "red");
		System.out.println(ctr1);
		Figure [] masFig = new Figure [5];
		masFig[0] = p1;
		masFig[1] = l1;
		masFig[2] = cp1;
		masFig[3] = cl1;
		masFig[4] = p2;
		int countpoint = 0;
		int countcolorpoint = 0;
		for (Figure aMasFig : masFig) {
			if (aMasFig.getClass().getSimpleName().equals("Point")) {
				countpoint++;
			}
			if (aMasFig.getClass().getSimpleName().equals("ColorPoint")) {
				countcolorpoint++;
			}
			System.out.println(aMasFig.getClass().getName());
		}
		
		System.out.println("Point: "+ countpoint + ", ColorPoint: " + countcolorpoint);
	}
	public static void TestColor (IColorAble colorObj) {
		System.out.println(colorObj.getColor());
	}
	public static void main(String[] args) {

		AbstractFactoryFigure figures = new FactoryFigure();
		Figure [] masFig1 = new Figure [60];
		Point [] masPoint = new Point [masFig1.length];
		int countpoint = 0;
		for (int i = 0; i < masFig1.length; i++) {
			masFig1[i]=figures.randFigure();
			if (masFig1[i]!=null&&"Point".equals(masFig1[i].getClass().getSimpleName())) {
				masPoint[countpoint++]=(Point)masFig1[i];
				}
		}
		masPoint = Arrays.copyOf(masPoint, countpoint);//обрезаем нули
		System.out.println("Points");
		for (Point aMasPoint : masPoint) {
			System.out.println(aMasPoint);
		}
		int countColor = 0;
		IColorAble [] masColor = new IColorAble[masFig1.length];
		for (Figure aMasFig1 : masFig1) {
			if (aMasFig1 instanceof IColorAble)
				masColor[countColor++] = (IColorAble) aMasFig1;
		}
		masColor = Arrays.copyOf(masColor, countColor);
		System.out.println("Color Figure");
		for (IColorAble aMasColor : masColor) {
			TestColor(aMasColor);
		}
	}
}

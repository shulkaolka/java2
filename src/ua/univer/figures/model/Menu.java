package ua.univer.figures.model;

import java.util.Scanner;

public class Menu {
	boolean exit;
	Scanner keyboard = new Scanner(System.in);

	public void runMenu() {
		while (!exit) {
			printMenu();
			int choice = getMenuChoice();
			performAction(choice);
		}
	}

	private void printMenu() {
		System.out.println("1) Create a point");
		System.out.println("2) Create a line");
		System.out.println("3) Create a triangle");
		System.out.println("0) Exit");
	}

	private int getMenuChoice() {
		int choice = -1;
		do {
			System.out.print("Enter your choice: ");
			try {
				choice = Integer.parseInt(keyboard.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
			if (choice < 0 || choice > 3) {
				System.out.println("Choice outside of range. Please chose again.");
			}
		} while (choice < 0 || choice > 3);
		return choice;
	}

	private void performAction(int choice) {
		switch (choice) {
		case 0:
			System.out.println("Good bye!");
			System.exit(0);
			break;
		case 1: {
			getPointArg();
		}
			break;
		case 2: {
			getLineArg();
		}
			break;
		case 3: {
			getTriangleArg();
		}
			break;
		default:
			System.out.println("Unknown error has occured.");
		}
	}

	private void getPointArg() {
		String color = isColor();
		int x = 0;
		int y = 0;
		int b = -1;
		do {
			System.out.print("Enter 'x': ");
			try {
				x = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		b = -1;
		do {
			System.out.print("Enter 'y': ");
			try {
				y = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		if (color == "") {
			Point p1 = new Point(x, y);
			System.out.println(p1);
		} else {
			ColorPoint p1 = new ColorPoint(x, y, color);
			System.out.println(p1);
		}
	}

	private void getLineArg() {
		String color = isColor();
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		int b = -1;
		do {
			System.out.print("Enter 'x1': ");
			try {
				x1 = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		b = -1;
		do {
			System.out.print("Enter 'y1': ");
			try {
				y1 = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		do {
			System.out.print("Enter 'x2': ");
			try {
				x2 = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		b = -1;
		do {
			System.out.print("Enter 'y2': ");
			try {
				y2 = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		if (color == "") {
			Line l1 = new Line(x1, y1, x2, y2);
			System.out.println(l1);
		} else {
			ColorLine l1 = new ColorLine(x1, y1, x2, y2, color);
			System.out.println(l1);
		}
	}

	private void getTriangleArg() {
		String color = isColor();
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		int x3 = 0;
		int y3 = 0;
		int b = -1;
		do {
			System.out.print("Enter 'x1': ");
			try {
				x1 = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		b = -1;
		do {
			System.out.print("Enter 'y1': ");
			try {
				y1 = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		do {
			System.out.print("Enter 'x2': ");
			try {
				x2 = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		b = -1;
		do {
			System.out.print("Enter 'y2': ");
			try {
				y2 = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		do {
			System.out.print("Enter 'x3': ");
			try {
				x3 = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		b = -1;
		do {
			System.out.print("Enter 'y3': ");
			try {
				y3 = Integer.parseInt(keyboard.nextLine());
				b = 0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
		} while (b != 0);
		if (color == "") {
			Triangle tr1 = new Triangle(x1, y1, x2, y2, x3, y3);
			System.out.println(tr1);
		} else {
			ColorTriangle tr1 = new ColorTriangle(x1, y1, x2, y2, x3, y3, color);
			System.out.println(tr1);
		}
	}

	private String isColor() {
		int a = -1;
		int b = -1;
		String color = "";
		do {
			System.out.println("Do you want set color to figure?: ");
			System.out.println("1) Yes");
			System.out.println("2) No");
			try {
				a = Integer.parseInt(keyboard.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Numbers only please.");
			}
			if (a < 1 || a > 2) {
				System.out.println("Choice outside of range. Please chose again.");
			}
		} while (a < 1 || a > 2);
		if (a == 1) {
			do {
				System.out.print("Enter color: ");
				try {
					color = keyboard.nextLine();
					b = 0;
				} catch (NumberFormatException e) {
					System.out.println("Invalid format.");
				}
			} while (b != 0);
		}
		return color;
	}

}

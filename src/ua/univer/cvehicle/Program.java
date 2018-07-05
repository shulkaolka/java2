package ua.univer.cvehicle;

public class Program {
	public static void main(String[] args) {
		CCar car = new CCar(1, 1, 23, 23, 23);
		System.out.println(car.toString());
		CPlain plain = new CPlain(1, 2, 3, 4, 4, 5, 5);
		plain.setCoordinate(4, 6);
		plain.setNumberPass(5);
		plain.setPrice(44.5);
		System.out.println(plain.toString());
		CShip ship = new CShip(1, 2, 3, 4, 4, 5, "hh");
		System.out.println(ship.toString());
	}
}

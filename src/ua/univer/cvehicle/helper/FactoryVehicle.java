package ua.univer.cvehicle.helper;

import ua.univer.cvehicle.transport.*;
public class FactoryVehicle extends AbstractFactoryVehicle {
    private final static int COUNT_OF_VEHICLE = 5;

    public  CVehicle randVehicle() { return getVehicle((int)(Math.random()*COUNT_OF_VEHICLE)); }
    public  CVehicle getVehicle(int n) {
        switch (n) {
            case 0:
                return new CCar(1, 1, 23, 23, 23);
            case 1:
                return new CPlain(1, 2, 3, 4, 4, 5, 5);
            case 2:
                return new CShip(1, 2, 3, 4, 4, 5, "Kiev");
            case 3:
                return new CCarBatman(1, 2, 3, 4, 4, 5);
            case 4:
                return new CCarAmphibian(1, 2, 3, 4, 4, "NY");
            default: return null;
        }
    }
}

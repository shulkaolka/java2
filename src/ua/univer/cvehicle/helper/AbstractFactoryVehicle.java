package ua.univer.cvehicle.helper;
import ua.univer.cvehicle.transport.*;

public abstract class AbstractFactoryVehicle {
    public abstract CVehicle randVehicle();
    public abstract CVehicle getVehicle(int n);
}

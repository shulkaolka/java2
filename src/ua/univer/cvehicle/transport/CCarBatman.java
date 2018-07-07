package ua.univer.cvehicle.transport;

public class CCarBatman extends CCar implements iRideAble, iFlyAble{
    private double height;
    public void setHeight(double height) {
        this.height = height;
    }
    public CCarBatman(int x, int y, double price, double speed, double yearBirth, double height) {
        super(x, y, price, speed, yearBirth);
        setHeight(height);
    }
    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Batman " + super.toString() + ", height=" + getHeight();
    }
}

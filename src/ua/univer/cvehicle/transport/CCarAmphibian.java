package ua.univer.cvehicle.transport;

public class CCarAmphibian extends CCar implements iRideAble, iSwimAble {
    private String destPort;
    public String getDestPort() {
        return destPort;
    }
    public void setDestPort(String destPort) {
        this.destPort = destPort;
    }

    public CCarAmphibian(int x, int y, double price, double speed, double yearBirth, String destPort) {
        super(x, y, price, speed, yearBirth);
        setDestPort(destPort);
    }

    @Override
    public String toString() {
        return "Amphibian" + super.toString() + ", destPort=" + destPort;
    }
}

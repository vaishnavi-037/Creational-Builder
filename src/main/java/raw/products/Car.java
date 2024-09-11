package raw.products;

public class Car {
    int seats;
    int wheels;
    int airBalloons;
    String engine;
    String gps;
    boolean radioSystem;
    boolean AC;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setAirBalloons(int airBalloons) {
        this.airBalloons = airBalloons;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public void setRadioSystem(boolean radioSystem) {
        this.radioSystem = radioSystem;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", wheels=" + wheels +
                ", airBalloons=" + airBalloons +
                ", engine='" + engine + '\'' +
                ", gps='" + gps + '\'' +
                ", radioSystem=" + radioSystem +
                ", AC=" + AC +
                '}';
    }
}

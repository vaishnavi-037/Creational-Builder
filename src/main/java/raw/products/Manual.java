package raw.products;

public class Manual {
    String seats;
    String wheels;
    String airBalloons;
    String engine;
    String gps;
    String radioSystem;
    String AC;

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setAirBalloons(String airBalloons) {
        this.airBalloons = airBalloons;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public void setRadioSystem(String radioSystem) {
        this.radioSystem = radioSystem;
    }

    public void setAC(String AC) {
        this.AC = AC;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "seats='" + seats + '\'' +
                ", wheels='" + wheels + '\'' +
                ", airBalloons='" + airBalloons + '\'' +
                ", engine='" + engine + '\'' +
                ", gps='" + gps + '\'' +
                ", radioSystem='" + radioSystem + '\'' +
                ", AC='" + AC + '\'' +
                '}';
    }
}

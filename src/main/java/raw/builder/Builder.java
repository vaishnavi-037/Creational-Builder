package raw.builder;

public interface Builder {
    void reset();
    void setSeats(int seats);
    void setWheels(int wheels);
    void setAirBalloons(int balloons);
    void setEngine();
    void setGPS();
    void setRadioSystem(boolean value);
    void setAC(boolean value);
}

package raw.builder;

import raw.products.Manual;

public class CarManualBuilder implements Builder {
    Manual manual;

    public CarManualBuilder() {
        reset();
    }

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        manual.setSeats("Car has " + seats + " seats.");
    }

    @Override
    public void setWheels(int wheels) {
        manual.setWheels("Car has " + wheels + " wheels.");
    }

    @Override
    public void setAirBalloons(int balloons) {
        manual.setAirBalloons("Car has " + balloons + " AirBalloons.");
    }

    @Override
    public void setEngine() {
        manual.setEngine("Car has EverReady Engine.");
    }

    public void setGPS() {
        manual.setGps("Car has Google GPS installed.");
    }

    @Override
    public void setRadioSystem(boolean value) {
        if(value) manual.setRadioSystem("Car has Radio System installed.");
        else manual.setRadioSystem("Car has no Radio System installed.");
    }

    @Override
    public void setAC(boolean value) {
        if(value) manual.setAC("Car has AC installed.");
        else manual.setAC("Car has no AC installed.");
    }

    public Manual getProduct() {
        return manual;
    }
}

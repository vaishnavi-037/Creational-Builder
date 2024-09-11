package raw.builder;

import raw.products.Car;

public class CarBuilder implements Builder {
    Car car;

    public CarBuilder() {
        reset();
    }

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    @Override
    public void setWheels(int wheels) {
        car.setWheels(wheels);
    }

    @Override
    public void setAirBalloons(int balloons) {
        car.setAirBalloons(balloons);
    }

    @Override
    public void setEngine() {
        car.setEngine("EverReady");
    }

    @Override
    public void setGPS() {
        car.setGps("Google GPS");
    }

    @Override
    public void setRadioSystem(boolean value) {
        car.setRadioSystem(value);
    }

    @Override
    public void setAC(boolean value) {
        car.setAC(value);
    }

    public Car getProduct() {
        return car;
    }
}

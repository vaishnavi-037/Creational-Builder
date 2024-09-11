package raw.director;

import raw.builder.Builder;

public class Director {
    Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void constructNormalCar(){
        builder.reset();
        builder.setWheels(4);
        builder.setEngine();
        builder.setSeats(6);
        builder.setAC(true);
        builder.setRadioSystem(false);
    }

    public void constructSUVCar(){
        builder.reset();
        builder.setWheels(6);
        builder.setEngine();
        builder.setSeats(12);
        builder.setAirBalloons(4);
        builder.setAC(true);
        builder.setGPS();
        builder.setRadioSystem(true);
    }
}

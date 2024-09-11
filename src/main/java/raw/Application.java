package raw;

import raw.builder.CarBuilder;
import raw.builder.CarManualBuilder;
import raw.director.Director;
import raw.products.Car;
import raw.products.Manual;

public class Application {
    public static void main(String[] args) {
        Car car = makeCar();
        Manual manual = makeManual();

        System.out.println(car.toString());
        System.out.println(manual.toString());
    }

    public static Car makeCar(){
        CarBuilder builder = new CarBuilder();
        Director director = new Director(builder);

        director.constructSUVCar();

        return builder.getProduct();
    }

    public static Manual makeManual(){
        CarManualBuilder builder = new CarManualBuilder();
        Director director = new Director(builder);

        director.constructSUVCar();

        return builder.getProduct();
    }
}

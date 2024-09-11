package refined.builders;

import refined.components.Engine;
import refined.components.GPSNavigator;
import refined.components.Transmission;
import refined.components.TripComputer;
import refined.products.CarType;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
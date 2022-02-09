package JavaCollectionsMainTask.Planes;

import JavaCollectionsMainTask.Classification.AirShipmentType;
import JavaCollectionsMainTask.Classification.AircraftBrand;
import JavaCollectionsMainTask.Classification.PlaneType;

import java.util.Objects;

public class CargoPlane extends Aircraft {
    private int capacityOfCargo;
    private AirShipmentType airShipmentType;

    public CargoPlane(AircraftBrand aircraftBrand, String model, PlaneType planeType, String tailNumber, int cruisingSpeed, int flightDistance, int fuelTank, int averageFuelConsumption, int capacityOfCargo, AirShipmentType airShipmentType) {
        super(aircraftBrand, model,  planeType, tailNumber,cruisingSpeed, flightDistance, fuelTank, averageFuelConsumption);
        this.capacityOfCargo = capacityOfCargo;
        this.airShipmentType = airShipmentType;
    }

    public int getCapacityOfCargo() {
        return capacityOfCargo;
    }

    public int setCapacityOfCargo(int capacityOfCargo) {
        this.capacityOfCargo = capacityOfCargo;
        return capacityOfCargo;
    }

    public AirShipmentType getAirShipmentType() {
        return airShipmentType;
    }

    public void setAirShipmentType(AirShipmentType airShipmentType) {
        this.airShipmentType = airShipmentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoPlane that = (CargoPlane) o;
        return capacityOfCargo == that.capacityOfCargo && airShipmentType == that.airShipmentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacityOfCargo, airShipmentType);
    }



    @Override
    public String toString() {
        return "id=" + id + '\t' +
                "Cargo plane{" +
                "Brand: " + aircraftBrand +
                ", Model: " + model +
                ", Assignment: " + planeType +
                ", Tail number: " + tailNumber +
                ", Cargo capacity (tones): " + capacityOfCargo +
                ", Crusing speed (km/h): " + cruisingSpeed +
                ", Flight distance (km): " + flightDistance +
                ", Fuel tank (tones): " + fuelTank +
                ", Average fuel consumption (liters/hour): " + averageFuelConsumption +
                ", Airshipment Type: " + airShipmentType +
                '}';

    }
}

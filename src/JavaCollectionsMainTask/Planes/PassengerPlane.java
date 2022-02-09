package JavaCollectionsMainTask.Planes;

import JavaCollectionsMainTask.Classification.AircraftBrand;
import JavaCollectionsMainTask.Classification.LineType;
import JavaCollectionsMainTask.Classification.PlaneType;

import java.util.Objects;

public class PassengerPlane extends Aircraft{
    private LineType lineType;
    private int capacityOfPassengers;

    public PassengerPlane(AircraftBrand aircraftBrand, String model,  PlaneType planeType, String tailNumber,  int cruisingSpeed, int flightDistance, int fuelTank, int averageFuelConsumption,  int capacityOfPassengers, LineType lineType) {
        super(aircraftBrand, model,  planeType, tailNumber, cruisingSpeed, flightDistance, fuelTank, averageFuelConsumption);
        this.lineType = lineType;
        this.capacityOfPassengers = capacityOfPassengers;
    }

    public LineType getLineType() {
        return lineType;
    }

    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }

    public int getCapacityOfPassengers() {
        return capacityOfPassengers;
    }

    public int setCapacityOfPassengers(int capacityOfPassengers) {
        this.capacityOfPassengers = capacityOfPassengers;
        return capacityOfPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerPlane that = (PassengerPlane) o;
        return capacityOfPassengers == that.capacityOfPassengers && lineType == that.lineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lineType, capacityOfPassengers);
    }



    @Override
    public String toString() {
        return "id=" + id +  '\t' +
                "Passenger plane{" +
                "Brand: " + aircraftBrand +
                ", Model: " + model +
                ", Assignment: " + planeType +
                ", Tail number: " + tailNumber +
                ", Passenger capacity (passengers): " + capacityOfPassengers +
                ", Crusing speed (km/h): " + cruisingSpeed +
                ", Flight distance (km): " + flightDistance +
                ", Fuel tank (tones): " + fuelTank +
                ", Average fuel consumption (liters/hour): " + averageFuelConsumption +
                ", Line Type: " + lineType +
                '}';
    }
}

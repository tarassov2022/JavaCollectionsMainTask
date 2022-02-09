package JavaCollectionsMainTask.Planes;

import JavaCollectionsMainTask.Classification.AircraftBrand;
import JavaCollectionsMainTask.Classification.LineType;
import JavaCollectionsMainTask.Classification.PlaneType;

import java.util.Objects;

public abstract class Aircraft {
    private static int idFirst = 1;
    public final int id = idFirst++;
    public AircraftBrand aircraftBrand;
    public String model;
    public PlaneType planeType;
    public String tailNumber;
    public int cruisingSpeed;
    public int flightDistance;
    public int fuelTank;
    public int averageFuelConsumption;

    public Aircraft(AircraftBrand aircraftBrand, String model,  PlaneType planeType, String tailNumber,  int cruisingSpeed, int flightDistance, int fuelTank, int averageFuelConsumption) {
        this.aircraftBrand = aircraftBrand;
        this.model = model;
        this.planeType = planeType;
        this.tailNumber = tailNumber;
        this.cruisingSpeed = cruisingSpeed;
        this.flightDistance = flightDistance;
        this.fuelTank = fuelTank;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public static int getIdFirst() {
        return idFirst;
    }

    public static void setIdFirst(int idFirst) {
        Aircraft.idFirst = idFirst;
    }

    public int getId() {
        return id;
    }

    public AircraftBrand getAircraftBrand() {
        return aircraftBrand;
    }

    public void setAircraftBrand(AircraftBrand aircraftBrand) {
        this.aircraftBrand = aircraftBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }


    public int getCruisingSpeed() {
        return cruisingSpeed;
    }

    public void setCruisingSpeed(int maxSpeed) {
        this.cruisingSpeed = maxSpeed;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    public void setFlightDistance(int flightDistance) {
        this.flightDistance = flightDistance;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(int averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft plane = (Aircraft) o;
        return id == plane.id &&
                cruisingSpeed == plane.cruisingSpeed &&
                flightDistance == plane.flightDistance &&
                fuelTank == plane.fuelTank &&
                averageFuelConsumption == plane.averageFuelConsumption &&
                aircraftBrand == plane.aircraftBrand &&
                model.equals(plane.model) &&
                tailNumber.equals(plane.tailNumber) &&
                planeType == plane.planeType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, aircraftBrand, model, tailNumber, planeType,  cruisingSpeed, flightDistance, fuelTank, averageFuelConsumption);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", aircraft brand=" + aircraftBrand +
                ", model='" + model + '\'' +
                ", plane type=" + planeType +
                ", tailNumber='" + tailNumber + '\'' +
                ", cruisingSpeed=" + cruisingSpeed +
                ", flightDistance=" + flightDistance +
                ", fuelTank=" + fuelTank +
                ", averageFuelConsumption=" + averageFuelConsumption +
                '}';
    }
}

package JavaCollectionsMainTask;

import JavaCollectionsMainTask.Planes.Aircraft;
import JavaCollectionsMainTask.Planes.CargoPlane;
import JavaCollectionsMainTask.Planes.PassengerPlane;

import java.util.*;

public class AirCompany {
    private List<? extends Aircraft> planes;

    List<PassengerPlane> passengerPlanes = new ArrayList<>();
    List<CargoPlane> cargoPlanes = new ArrayList<>();


    public AirCompany(List<? extends Aircraft> planes) {
        this.planes = planes;
    }

    public List<? extends Aircraft> getPlanes() {
        return planes;
    }

    public void setPlanes(List<? extends Aircraft> planes) {
        this.planes = planes;
    }

    public int getTotalCapacityPassengers() {
        return passengerPlanes.stream().mapToInt(PassengerPlane::getCapacityOfPassengers).sum();
    }

    public int getTotalCapacityCargo(){
        return cargoPlanes.stream().mapToInt(CargoPlane::getCapacityOfCargo).sum();
       }



    public List<PassengerPlane> getPassengerPlanes() {
        planes.forEach(plane -> {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        });
        return passengerPlanes;
    }

    public void setPassengerPlanes(List<PassengerPlane> passengerPlanes) {
        this.passengerPlanes = passengerPlanes;
    }

    public List<CargoPlane> getCargoPlanes() {
        planes.forEach(plane -> {
            if (plane instanceof CargoPlane) {
                cargoPlanes.add((CargoPlane) plane);
            }
        });
        return cargoPlanes;
    }

    public void setCargoPlanes(List<CargoPlane> cargoPlanes) {
        this.cargoPlanes = cargoPlanes;
    }



    public List<Aircraft> filterAverageFuelConsumption(int minAverageFuelConsumption, int maxAverageFuelConsumption) {
        List<Aircraft> result = new ArrayList<>();
        planes.forEach(plane -> {
            if (plane.getAverageFuelConsumption() >= minAverageFuelConsumption && plane.getAverageFuelConsumption() <= maxAverageFuelConsumption) result.add(plane);
        });
        return result;
    }

    public Collection<? extends Aircraft> sortByFlightDistance () {
        planes.sort((Comparator<Aircraft>) (o1, o2) -> o1.getFlightDistance() - o2.getFlightDistance());
        return planes;
    }

    public void printPlane(Collection<? extends Aircraft> collection) {
        for (Aircraft aircraft : collection) {
            System.out.println(aircraft);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirCompany that = (AirCompany) o;
        return planes.equals(that.planes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planes);
    }

    @Override
    public String toString() {
        return "Aircompany{" +
                "planes=" + planes +
                '}';
    }
}

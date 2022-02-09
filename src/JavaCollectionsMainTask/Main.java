package JavaCollectionsMainTask;

import JavaCollectionsMainTask.Classification.*;
import JavaCollectionsMainTask.Planes.Aircraft;
import JavaCollectionsMainTask.Planes.CargoPlane;
import JavaCollectionsMainTask.Planes.PassengerPlane;

import java.util.Arrays;
import java.util.List;

public class Main {
    static List<Aircraft> planes = Arrays.asList(
            new PassengerPlane(AircraftBrand.AIRBUS, "A320", PlaneType.PASSENGER, "RA-10101", 853,6000,24, 2400, 132, LineType.MEDIUMDISTANCE),
            new PassengerPlane(AircraftBrand.AIRBUS,"A330",PlaneType.PASSENGER,"RA-10102",871,13400,139,6400,440,LineType.LONGDISTANCE),
            new PassengerPlane(AircraftBrand.BOEING,"737",PlaneType.PASSENGER,"RA-10103",817,2600,10,2500,114,LineType.MEDIUMDISTANCE),
            new PassengerPlane(AircraftBrand.TU, "134",PlaneType.PASSENGER,"RA-10104",850,2100,13,2300,80,LineType.SHORTDISTANCE),
            new PassengerPlane(AircraftBrand.IL, "86", PlaneType.PASSENGER,"RA-10105",900,5200,114,10000,350,LineType.MEDIUMDISTANCE),
            new CargoPlane(AircraftBrand.AN,"12",PlaneType.CARGO,"RA-10106",570,5500,22,1600,18,AirShipmentType.LOCAL),
            new CargoPlane(AircraftBrand.AIRBUS,"300",PlaneType.CARGO,"RA-10107",850,3400,48,6000,34,AirShipmentType.INTERNATIONAL),
            new CargoPlane(AircraftBrand.AN,"74",PlaneType.CARGO,"RA-10108", 550,2700,16,1300,8,AirShipmentType.LOCAL),
            new CargoPlane(AircraftBrand.BOEING,"757",PlaneType.CARGO,"RA-10109",850,7000,43,3300,39,AirShipmentType.INTERNATIONAL),
            new CargoPlane(AircraftBrand.DC,"10",PlaneType.CARGO,"RA-10111",908,12000,153,8000,65,AirShipmentType.INTERNATIONAL)
    );

    public static void main(String[] args) {
        AirCompany airCompany = new AirCompany(planes);
        System.out.println("\nThe Aircompany aircraft fleet:");
        airCompany.printPlane(planes);
        System.out.println("\nThe passenger aircraft fleet:");
        airCompany.printPlane(airCompany.getPassengerPlanes());
        System.out.println("The total passenger capacity of passenger planes (passengers): " + airCompany.getTotalCapacityPassengers());
        System.out.println("\nThe cargo planes fleet:");
        airCompany.printPlane(airCompany.getCargoPlanes());
        System.out.println("The total cargo capacity of cargo planes (tones): " + airCompany.getTotalCapacityCargo());
        System.out.println("\nThe planes with average fuel consumption within the limit of 2000-4000 liters/hour:");
        airCompany.printPlane(airCompany.filterAverageFuelConsumption(2000, 4000));
        System.out.println("\nThe Aircompany aircraft fleet sorted by the flight distance:");
        airCompany.printPlane(airCompany.sortByFlightDistance());
    }
}

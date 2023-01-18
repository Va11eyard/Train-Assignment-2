package kz.aitu.oop.practice.practice2;

import java.util.List;
import java.util.ArrayList;

public class Restaurant extends Train {
    private int id;

    private List<Passenger> passengerList;
    public Restaurant(int id) {
        super("22:15", 60, 2, "Astana-Almaty", 60, "KM / Hour",20, 5,40);
        this.id=id;

        passengerList = new ArrayList<Passenger>();
    }
    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    @Override
    public void displayPassengerList() {
        System.out.println("Displaying passenger list for Restaurant ");
        for(Passenger passenger : passengerList) {
            System.out.println("Name: " + passenger.firstName + " " + passenger.lastName);
            System.out.println("Ticket Number: " + passenger.ticketNumber);
            System.out.println("Age: " + passenger.age);
            System.out.println("Food preference: " + passenger.foodPreference);
            System.out.println("-----------------------------");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Restaurant wagon: class Business ");
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Number of Passengers: " + numPassengers);
        System.out.println("Number of Wagons: " + numWagons);
        System.out.println("Direction: " + direction);
        System.out.println("Speed: " + speed + " " + kmH);
        System.out.println("Number of Children: " + numChildren);
        System.out.println("Number of Disabled: " + numDisabled);
        System.out.println("Number of Adults: " + numAdults);
    }
}
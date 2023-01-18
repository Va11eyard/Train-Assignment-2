package kz.aitu.oop.practice.practice2;
import java.util.ArrayList;


public class Luxury extends Train {
    private int id;
    private ArrayList<Passenger> passengerList;
    public Luxury(int id) {
        super("22:15", 45,10,"Astana-Almaty", 60, "KM / Hour", 15,0,30);
        this.id=id;

        passengerList = new ArrayList<Passenger>();
    }

    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    @Override
    public void displayPassengerList() {
        System.out.println("Displaying passenger list for Luxury class ");
        for(Passenger passenger : passengerList) {
            System.out.println("Name: " + passenger.firstName + " " + passenger.lastName);
            System.out.println("Ticket Number: " + passenger.ticketNumber);
            System.out.println("Age: " + passenger.age);
            System.out.println("Discount: " + passenger.getDiscount());
            System.out.println("-----------------------------");
        }
    }
    @Override
    public void displayInfo() {
        System.out.println("Luxury wagon: Business class ");
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





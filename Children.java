package kz.aitu.oop.practice.practice2;


public class Children extends Passenger {
    public Children(String firstName, String lastName, int ticketNumber, double price, int age, String foodPreference) {
        super(firstName, lastName, ticketNumber, price, age, foodPreference);
    }

    @Override
    public double getDiscount() {
        return price * 0.1;
    }
}
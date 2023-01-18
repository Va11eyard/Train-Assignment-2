package kz.aitu.oop.practice.practice2;

abstract class Passenger {
    public String firstName;
    public String lastName;
    public int ticketNumber;
    public double price;
    public int age;
    public String foodPreference;

    public Passenger(String firstName, String lastName, int ticketNumber, double price, int age, String foodPreference) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketNumber = ticketNumber;
        this.price = price;
        this.age = age;
        this.foodPreference = foodPreference;
    }

    public abstract double getDiscount();
}
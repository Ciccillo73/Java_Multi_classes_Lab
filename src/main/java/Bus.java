import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>(0);
    }
    //getters
    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    //setters
    public void setDestination( String newDestination) {
        this.destination = newDestination;
    }

//    public void String setNumberOfPassengers( ArrayList<Person> newPassenger) {
//        this.passengers = newPassenger;
//    }

    public void setCapacity( int newCapacity) {
        this.capacity = newCapacity;
    }

    //methods


    public void addPassenger(Person person){
        if(getNumberOfPassengers() < getCapacity() ) {
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        this.passengers.remove(0);
    }

    public void pickUpPassenger(BusStop busStop) {
        Person person = busStop.removePerson();
        this.passengers.add(person);
    }
}

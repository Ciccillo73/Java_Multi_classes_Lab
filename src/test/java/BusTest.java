import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 5 );
        person = new Person("Dick");
        busStop = new BusStop("Glasgow");
        busStop.addPerson(person);
    }

    @Test
    public void hasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, bus.getCapacity());
    }

    @Test
    public void checkTheNumberOfPassengers(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canChangeDestination(){
        bus.setDestination("Edinburgh");
        assertEquals("Edinburgh", bus.getDestination());


    }

    @Test
    public void cantExceedTheCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.getNumberOfPassengers());
    }


    @Test
    public void canAddPassengers(){
        bus.addPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.getNumberOfPassengers());

    }

    @Test
    public void canPickUpFromBusStop(){
    bus.pickUpPassenger(busStop);
    assertEquals(1,bus.getNumberOfPassengers());
    }


}

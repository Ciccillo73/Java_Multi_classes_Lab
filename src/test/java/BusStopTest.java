import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

   private BusStop busStop;
   private Person person;

   @Before
    public void before(){
        busStop = new BusStop("Glasgow");
        person = new Person("John");

   }

   @Test
    public void hasName(){
       assertEquals("Glasgow", busStop.getName());
   }

   @Test
    public void queueStartsEmpty(){
       assertEquals(0, busStop.getQueue());
   }

   @Test
    public void addPersonToQueue(){
       busStop.addPerson(person);
       assertEquals(1, busStop.getQueue());
   }

   @Test
    public void removePersonFromQueue(){
       busStop.addPerson(person);
       busStop.removePerson();
       assertEquals(0, busStop.getQueue());
   }


}

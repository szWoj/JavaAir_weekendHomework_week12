import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Mike", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Mike", passenger.getName());
    }

    @Test
    public void hasBagsNo(){
        assertEquals(2, passenger.getBagsNo());
    }


}

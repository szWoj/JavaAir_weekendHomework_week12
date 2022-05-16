import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class FlightTest {

    Flight flight;
    ArrayList<CabinCrew> cabinCrewTeam;
    ArrayList<Pilot> pilots;
    PlaneType plane;
    String flightNo;
    String destination;
    String departureAirport;
    String departureTime;

    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    Pilot pilot1;
    Passenger passenger1;
    Passenger passenger2;



    @Before
    public void before(){

        pilot1 = new Pilot("Mark", Rank.FIRSTOFFICER, "ABCD1234");
        cabinCrew1 = new CabinCrew("Fred", Rank.FIRSTOFFICER);
        cabinCrew2 = new CabinCrew("Bob", Rank.PURSER);
        pilots = new ArrayList<>();
        pilots.add(pilot1);
        cabinCrewTeam = new ArrayList<>();
        cabinCrewTeam.add(cabinCrew1);
        cabinCrewTeam.add(cabinCrew2);


        flight = new Flight(pilots, cabinCrewTeam, PlaneType.Airbus380, "027", "GLA",
                "DXB", "07:20");




    }
    @Test
    public void canBookAPassanger(){
        assertEquals(0, flight.getANumberOfBookedPassengers());
        flight.bookAPassenger(passenger1);
        assertEquals(1, flight.getANumberOfBookedPassengers());

    }
    @Test
    public void findNumberOfFreeSeatsIn380(){
        assertEquals(0, flight.getANumberOfBookedPassengers());
        flight.bookAPassenger(passenger1);
        assertEquals(1, flight.getANumberOfBookedPassengers());
        assertEquals(445, flight.findNumberOfAvailableSeatsA380());

    }

    @Test
    public void findNumberOfFreeSeatsIn777(){
        assertEquals(0, flight.getANumberOfBookedPassengers());
        flight.bookAPassenger(passenger2);
        assertEquals(1, flight.getANumberOfBookedPassengers());
        assertEquals(309, flight.findNumberOfAvailableSeats777());

    }



}

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrewTeam;
    private ArrayList<Passenger> passengers; //starts empty when instance of this class created
    private PlaneType type;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList pilots,
                  ArrayList cabinCrewTeam,
                  PlaneType planeType,
                  String flightNo,
                  String destination,
                  String departureAirport,
                  String departureTime){



        this.pilots = new ArrayList<Pilot>(); //at least one in
        this.cabinCrewTeam = new ArrayList<CabinCrew>();
        this.type = planeType;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

        this.passengers = new ArrayList<>(); //empty by default

    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public PlaneType getType() {
        return type;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public ArrayList<CabinCrew> getCabinCrewTeam() {
        return cabinCrewTeam;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getANumberOfBookedPassengers(){
        return this.passengers.size();
    }

    public void bookAPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int findNumberOfAvailableSeatsA380(){
        return PlaneType.Airbus380.getCapacity() - this.passengers.size();
    }

    public int findNumberOfAvailableSeats777(){
        return PlaneType.Boeing777.getCapacity() - this.passengers.size();
    }



}

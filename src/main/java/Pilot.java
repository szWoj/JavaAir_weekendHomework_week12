public class Pilot extends CabinCrew{

    private String licenceNo;

    public Pilot(String name, Rank rank, String licenceNo){
        super(name, rank);
        this.licenceNo = licenceNo;
    }

    public String flyPlane(){
        return "I am flying this plane";
    }

    public String getLicenceNo() {
        return licenceNo;
    }
}

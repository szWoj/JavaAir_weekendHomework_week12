public enum Rank {

    CAPTAIN(1),
    FIRSTOFFICER(2),
    PURSER(3),
    FLIGHTATTENDANT(4);

    private final int ranking;

    Rank(int ranking){
        this.ranking = ranking;
    }

    public int getRanking(){
        return ranking;
    }
}

public class Visit extends Tasks{
    private String arrival;
    private String wayTravel;

    /**
     * @param arrival     место прибытия
     * @param wayTravel   способ передвижения
     */
    public Visit(String name, String date, double duration, boolean personal, boolean priority, Employee responsible,
                 String arrival, String wayTravel) {
        super(name, date, duration, personal, priority, responsible);
        this.arrival = arrival;
        this.wayTravel = wayTravel;
    }

    @Override
    public String toString() {
        return super.toString() + ", место прибытия: " + arrival + ", способ передвижения: " + wayTravel;
    }

    public String getArrival(){
        return arrival;
    }

    public void setArrival(String arrivalSet){
        this.arrival = arrivalSet;
    }

    public String getWayTravel(){
        return wayTravel;
    }

    public void setWayTravel(String wayTravelSet){
        this.wayTravel = wayTravelSet;
    }
}

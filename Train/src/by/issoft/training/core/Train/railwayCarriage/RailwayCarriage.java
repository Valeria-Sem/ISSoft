package by.issoft.training.core.Train.railwayCarriage;

public abstract class RailwayCarriage {

    private RailwayCarriageType type;
    private String route;
    private int number;

    protected RailwayCarriage(RailwayCarriageType type, String route) {
        this.type = type;
        this.route = route;
    }

    public RailwayCarriage(int number){
        this.number = number;
    }

    public String getRoute() {
        return route;
    }

    public RailwayCarriageType getType() {
        return type;
    }

    public String getInfo(){
        return getRoute() + " " + getType();
    }
}

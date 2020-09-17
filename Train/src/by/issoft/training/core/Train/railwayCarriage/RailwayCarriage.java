package by.issoft.training.core.Train.railwayCarriage;

public abstract class RailwayCarriage {

    private final RailwayCarriageType type;
    private final String route;

    protected RailwayCarriage(RailwayCarriageType type, String route) {
        this.type = type;
        this.route = route;
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

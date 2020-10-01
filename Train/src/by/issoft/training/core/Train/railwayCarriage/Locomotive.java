package by.issoft.training.core.Train.railwayCarriage;

import by.issoft.training.core.userInfo.User;

public class Locomotive extends RailwayCarriage{

    private int speed;
    private User driver;

    public RailwayCarriage[] getRailwayCarriages() {
        return railwayCarriages;
    }

    public void setRailwayCarriages(RailwayCarriage[] railwayCarriages) {
        this.railwayCarriages = railwayCarriages;
    }

    private RailwayCarriage[] railwayCarriages = new RailwayCarriage[10];

    public Locomotive(User driver, int speed, RailwayCarriageType type, String route) {
        super(type, route);
        this.driver = driver;
        this.speed = speed;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String getInfo(){
        return getRoute() + " " + getType() + " " + getDriver() + " " + getSpeed();
    }

}

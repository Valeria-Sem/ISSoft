package by.issoft.training.core.Train.railwayCarriage;

import by.issoft.training.core.userInfo.User;

public class PassengerRailwayCarriage extends RailwayCarriage{

    private Integer numberOfSeats;

    public PassengerRailwayCarriage(RailwayCarriageType type, String route, int numberOfSeats) {
        super(type, route);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    private User[] passengers = new User[16];
    private int countOfPassengers = 0;


    public void addPassengers (User... passengers){
        for(int i=0; i < passengers.length; i++){
            this.passengers[i] = passengers[i];
            countOfPassengers++;
        }
    }

    @Override
    public String getInfo(){
        return "RailwayCarriage - " + getType() + " go to - " + getRoute() + " get "  + getNumberOfSeats()
                + " seats and " + countOfPassengers + " passenger(s)";
    }
}

package by.issoft.training.core;

public class Train {

    private final RailwayCarriage[] countOfRailwayCarriage = new RailwayCarriage[15];

    public final RailwayCarriage[] getCountOfRailwayCarriage() {
        return countOfRailwayCarriage;
    }

    public void addRailwayCarriage (RailwayCarriage... countOfRailwayCarriage){
        for(int i=0; i < countOfRailwayCarriage.length; i++){
            this.countOfRailwayCarriage[i] = countOfRailwayCarriage[i];
        }
    }
}

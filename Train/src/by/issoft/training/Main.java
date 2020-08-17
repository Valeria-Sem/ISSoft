package by.issoft.training;

import by.issoft.training.core.Cargo;
import by.issoft.training.core.RailwayCarriage;
import by.issoft.training.core.Train;

public class Main {

    public static void main (String[] arg){

        Cargo cargo1 = new Cargo("metal", 300, 1);
        Cargo cargo2 = new Cargo("metal", 100, 2);
        Cargo cargo3 = new Cargo("cheese", 10, 9);
        Cargo cargo4 = new Cargo("nails", 89.99, 3);
        Cargo cargo5 = new Cargo("concrete", 555.6, 1);
        Cargo cargo6 = new Cargo("glass", 100, 1);

        RailwayCarriage railwayCarriage1 = new RailwayCarriage(400, 1);
        RailwayCarriage railwayCarriage2 = new RailwayCarriage(200, 2);
        RailwayCarriage railwayCarriage3 = new RailwayCarriage(600, 3);
        RailwayCarriage railwayCarriage4 = new RailwayCarriage(800, 4);

        railwayCarriage1.loadingCargo(cargo1, cargo6);
        railwayCarriage2.loadingCargo(cargo2);
        railwayCarriage3.loadingCargo(cargo4, cargo3);
        railwayCarriage4.loadingCargo(cargo5);

        Train train = new Train();
        train.addRailwayCarriage(railwayCarriage1, railwayCarriage2, railwayCarriage3, railwayCarriage4);

    }
}

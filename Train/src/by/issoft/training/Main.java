package by.issoft.training;

import by.issoft.training.core.Cargo;
import by.issoft.training.core.Train.Train;
import by.issoft.training.core.Train.railwayCarriage.*;
import by.issoft.training.core.userInfo.Sex;
import by.issoft.training.core.userInfo.User;

import java.time.LocalDate;

public class Main {

    public static void main (String[] arg){

        Cargo cargo1 = new Cargo("metal", 300, 1);
        Cargo cargo2 = new Cargo("metal", 100, 2);
        Cargo cargo3 = new Cargo("cheese", 10, 9);
        Cargo cargo4 = new Cargo("nails", 89.99, 3);
        Cargo cargo5 = new Cargo("concrete", 555.6, 1);
        Cargo cargo6 = new Cargo("glass", 100, 1);

        PassengerRailwayCarriage pass = new PassengerRailwayCarriage(RailwayCarriageType.PASSENGER_RAILWAY,
                "Minsk - Vilnius", 16);

//        pass.getInfo();

        CargoRailwayCarriage railwayCarriage1 = new CargoRailwayCarriage(400, 1,
                RailwayCarriageType.CARGO_RAILWAY,
                "Minsk - Vilnius");
        CargoRailwayCarriage railwayCarriage2 = new CargoRailwayCarriage(200, 2,
                RailwayCarriageType.CARGO_RAILWAY,
                "Minsk - Vilnius");
        CargoRailwayCarriage railwayCarriage3 = new CargoRailwayCarriage(600, 3,
                RailwayCarriageType.CARGO_RAILWAY,
                "Minsk - Vilnius");
        CargoRailwayCarriage railwayCarriage4 = new CargoRailwayCarriage(800, 4,
                RailwayCarriageType.CARGO_RAILWAY,
                "Minsk - Vilnius");

        railwayCarriage1.loadingCargo(cargo1, cargo6);
        railwayCarriage2.loadingCargo(cargo2);
        railwayCarriage3.loadingCargo(cargo4, cargo3);
        railwayCarriage4.loadingCargo(cargo5);

        railwayCarriage2.getInfo();

        User user1 = new User("Valeria", "Semianenia", LocalDate.of(2001, 07, 15),
               "BB3456789", "RB", Sex.FEMALE );
      //  System.out.println(pass.passengers.length);

        pass.addPassengers(user1);

        System.out.println(pass.getInfo());
        System.out.println(railwayCarriage2.getInfo());

           }
}

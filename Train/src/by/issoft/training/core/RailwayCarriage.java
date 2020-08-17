package by.issoft.training.core;

public class RailwayCarriage {

    private double carryingCapacity;
    private int railwayCarriageNumber;

    public RailwayCarriage(double carryingCapacity, int railwayCarriageNumber) {
        this.carryingCapacity = carryingCapacity;
        this.railwayCarriageNumber = railwayCarriageNumber;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getRailwayCarriageNumber() {
        return railwayCarriageNumber;
    }

    public void setRailwayCarriageNumber(int railwayCarriageNumber) {
        this.railwayCarriageNumber = railwayCarriageNumber;
    }


    private  Cargo[] cargos = new Cargo[100];

    public void loadingCargo(Cargo... cargos){
        for (int i=0; i < cargos.length; i++){
            if(cargos[i].getTotalWeight() > carryingCapacity){
                throw new RuntimeException("Cargos: " + cargos[i].getDescription() + " with total weight = " +
                        cargos[i].getTotalWeight() + " too heavy for this railway carriage - " + railwayCarriageNumber);
            }
            System.out.println("Cargos: " + cargos[i].getDescription() + " with total weight = " +
                    cargos[i].getTotalWeight() + " was loaded into railway carriage № " + railwayCarriageNumber +
                    " with carrying capacity = " + carryingCapacity);
                this.cargos[i] = cargos[i];
                carryingCapacity -= cargos[i].getTotalWeight();
                System.out.println("Now carrying capacity = " + carryingCapacity);
        }
    }
}

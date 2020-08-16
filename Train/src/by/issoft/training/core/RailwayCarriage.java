package by.issoft.training.core;

public class RailwayCarriage {

    private double carryingCapacity;

    public RailwayCarriage(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    private  Cargo[] cargos = new Cargo[100];

    public void counter(Cargo... cargos){
        for (int i=0; i < cargos.length; i++){
            if(cargos[i].getTotalWeight() > carryingCapacity){
                throw new RuntimeException("Cargos: " + cargos[i].getDescription() + " with total weight = " +
                        cargos[i].getTotalWeight() + " too heavy for this railway carriage");
            }
            if (carryingCapacity > 0 && carryingCapacity - cargos[i].getTotalWeight() >= 0){
                this.cargos[i] = cargos[i];
                carryingCapacity -= cargos[i].getTotalWeight();
            }
        }
    }
}

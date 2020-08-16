package by.issoft.training.core;

public class Cargo {

    private String description;
    private double weight;
    private int amount;

    private double totalWeight;

    public Cargo(String description, double weight, int amount) {
        this.description = description;
        this.weight = weight;
        this.amount = amount;

        counter();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void counter(){
        totalWeight = weight * amount;
    }

}

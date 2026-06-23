package IntermediateLevel7;

public class Shuriken {
    private int amount;

    public Shuriken(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Shuriken: " + amount;
    }
}
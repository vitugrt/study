package IntermediateLevel7;

public class Invocation {
    private boolean animal;

    public Invocation(boolean animal) {
        this.animal = animal;
    }

    public boolean getAnimal(){
        return animal;
    }

    @Override
    public String toString(){
        return "Invocation is: " + animal;
    }
}


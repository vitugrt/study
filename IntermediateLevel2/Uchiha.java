package IntermediateLevel2;

public class Uchiha extends Ninja {
    //not this. because it's a sub-class
    public Uchiha(){
        super();
    }

    //referencing the super class ninja
    public Uchiha(String name, int age, String village) {
        super(name, age, village);
    }

    //overwrite the method from Ninja class
    @Override
    public void specialAbility(){
        System.out.println("My name is " + name + " and my power is fire");
    }
}

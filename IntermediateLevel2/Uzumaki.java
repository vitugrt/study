package IntermediateLevel2;

public class Uzumaki extends Ninja{

    public Uzumaki(){
        super();
    }

    public Uzumaki(String name, int age, String village, int missionNumber, TypeNinja rank) {
        super(name, age, village, missionNumber, rank);
    }

    //name and method from Ninja
    @Override
    public void specialAbility(){
        System.out.println("My name is " + name + " and my power is wind");
    }

    public void shouting(){
        System.out.println("My name is " + name + " I have " + age + " years and lives in " + village);
        System.out.println("I have completed " + missionNumber + " missions so I'm a " + rank);
    }
}

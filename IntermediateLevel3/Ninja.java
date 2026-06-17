package IntermediateLevel3;

//abstract so I can no longer use it as object
public abstract class Ninja implements Strategy{
    //TODO: add 2 new atributes missionNumber and rank

    String name;
    int age;
    String village;
    int missionNumber;
    TypeNinja rank;
    final double PI = 3.14;

    //to use constructor on sasuke
    public Ninja(){

    }

    //to use constructor on itachi
    public Ninja(String name, int age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;
    }

    //TODO: constructor overwrite

    //just the new atributes have to be declared


    public Ninja(String name, int age, String village, int missionNumber, TypeNinja rank) {
        this(name, age, village);
        this.missionNumber = missionNumber;
        this.rank = rank;
    }

    //every ninja will have it
    public void specialAbility(){
        System.out.println("My name is " + name + " and that's my power");
    }

    //you have to overwrite because it's from the interface
    @Override
    public void strategy() {
        System.out.println("That's my strategy!");
    }

    //abstract method from abstract class don't have to be @Override
    @Override
    public void strategyAdvanced(){
        System.out.println("My strategy became more powerfull");
    };

    //final methods can't be overidden
    final void welcome(){
        System.out.println("Welcome!");
    }

}


package IntermediateLevel2;

//abstract so I can no longer use it as object
public abstract class Ninja implements Strategy{
    String name;
    int age;
    String village;

    //to use constructor on sasuke
    public Ninja(){

    }

    //to use constructor on itachi
    public Ninja(String name, int age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;
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
}


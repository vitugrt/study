package IntermediateLevel2;

//abstract so I can no longer use it as object
public abstract class Ninja implements Strategy{

    String name;
    int age;
    String village;

    //every ninja will have it
    public void specialAbility(){
        System.out.println("My name is " + name + " and that's my power");
    }

    @Override
    public void strategy() {
        System.out.println("That's my strategy!");
    }
}


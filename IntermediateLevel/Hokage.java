package IntermediateLevel;

public abstract class Hokage {
    //used to as "primary" class
    String name;
    int age;
    boolean alive;

    //abstract method can't have body
    public abstract void wisdom();

    //you can create a concrect method in an abstract class, but not in an interface
    public void chakra(){
        System.out.println("I have full chakra");
    }
}


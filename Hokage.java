package IntermediateLevel;

public abstract class Hokage {
    String name;
    int age;
    boolean alive;

    public abstract void wisdom();

    public Hokage(){
        //empty constructor, no args
    }

    //all args constructor
    public Hokage(String name, int age, boolean alive){
        this.name = name;
        this.age = age;
        this.alive = alive;
    }
}

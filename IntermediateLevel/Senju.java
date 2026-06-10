package IntermediateLevel;

public class Senju extends Hokage {

    public Senju() {
        //empty constructor, no args
    }
    //all args constructor (setting the parameter)
    public Senju(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    //abstract from Hokage
    public void wisdom (){
        System.out.println("You're wisdom now");
    }
}
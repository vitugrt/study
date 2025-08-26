package ChallengeInterface;

public class Genin implements Ninja{
    String name;
    int age;
    String ability;

    public Genin(String name, int age, String ability) {
        this.name = name;
        this.age = age;
        this.ability = ability;

    }

    public void showInfo(){
        System.out.println("My name is " + name + "and I'm " + age + " years old.");
    }

    public void useAbility(){
        System.out.println("My ability is " + ability);
    }
}


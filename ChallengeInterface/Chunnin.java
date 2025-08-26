package ChallengeInterface;

public class Chunnin implements Ninja{

    String name;
    int age;
    String ability;
    String specialty;

    public Chunnin(String name, int age, String ability, String specialty) {
        this.name = name;
        this.age = age;
        this.ability = ability;
        this.specialty = specialty;

    }
    public void showInfo(){
        System.out.println("My name is " + name + "and I'm " + age + "years old.\nMy specialty is " + specialty);
    }

    public void useAbility(){
        System.out.println("My ability is " + ability);
    }
}
package Challenges;

public class Ninja {
    String name;
    int age;
    String mission;
    char missionRank;
    boolean missionStatus;

    public void showInfo(){
        System.out.println("My name is " + name);
        System.out.println("I have "+ age + " years old");
        System.out.println("My mission is " + mission);
        System.out.println("And the difficulty is " + missionRank);
        System.out.println("And I am " + missionStatus);
    }
}

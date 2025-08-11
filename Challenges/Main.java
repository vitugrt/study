package Challenges;

public class Main {
    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.age = 16;
        Sasuke.mission = "Escape Konoha";
        Sasuke.missionRank = 'S';
        Sasuke.missionStatus = true;

        Sasuke.showInfo();

        String dojutsu = Sasuke.sharingan();
        System.out.println(dojutsu);
    }
}

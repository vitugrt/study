package IntermediateLevel2;

public class Main {
    public static void main(String[] args) {

        //object from Uzumaki
        Uzumaki Naruto = new Uzumaki();
        Naruto.name = "Naruto Uzumaki";
        Naruto.age = 16;
        Naruto.specialAbility();
        Naruto.strategy();

        //object from Uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.age = 17;
        Sasuke.specialAbility();
        Sasuke.strategy();
    }
}

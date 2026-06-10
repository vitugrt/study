package IntermediateLevel2;

public class Main {
    public static void main(String[] args) {

        //object from Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.age = 16;
        naruto.specialAbility();
        //you use the interface so you don't have to implent in every class
        //you are implementing in abstract class and extending only the class
        naruto.strategy();
        naruto.strategyAdvanced();

        //object from Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.age = 17;
        sasuke.specialAbility();
        sasuke.strategy();
        sasuke.strategyAdvanced();

    }
}

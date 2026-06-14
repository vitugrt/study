package IntermediateLevel2;

public class Main {
    public static void main(String[] args) {

        /*
        //object from Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.age = 16;
        naruto.specialAbility();
        //you use the interface so you don't have to implent in every class
        //you are implementing in abstract class and extending only the class
        naruto.strategy();
        naruto.strategyAdvanced();
        */

        Uzumaki naruto = new Uzumaki("Naruto", 16, "Konoha", 5, TypeNinja.GENIN);
        naruto.shouting();

        //object from Uchiha
        /*
        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.age = 17;
        sasuke.specialAbility();
        sasuke.strategy();
        sasuke.strategyAdvanced();
        */

        //new object with all constructor
        Uchiha sasuke = new Uchiha("Sasuke", 17, "Konoha", 10, TypeNinja.GENIN);
        sasuke.specialAbility();
        sasuke.strategyAdvanced();

        //new object with super class
        Uchiha itachi = new Uchiha("Itachi", 27, "Konoha");
        itachi.specialAbility();

        //new object with constructor override
        Uchiha madara = new Uchiha("Madara", 47, "Konoha", 900, TypeNinja.KAGE);
        madara.specialAbility();
        madara.strategy();

    }
}

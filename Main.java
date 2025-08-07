package IntermediateLevel;

public class Main {
    public static void main(String[] args) {

        //how to create a ninja
        String name1 = "Naruto Uzumaki";
        String village1 = "Konoha";
        int age1 = 16;

        //another ninja
        String name2 = "Sasuke Uchiha";
        String village2 = "Konoha";
        int age2 = 16;

        //how can i create a great amount of ninja? class!
        Ninja Naruto = new Ninja();
        Naruto.name = "Naruto Uzumaki";
        Naruto.village = "Konoha";
        Naruto.age = 17;

        //calling the string method
        String shouting = Naruto.hokage();
        System.out.println(shouting);

        int howManyYears =Naruto.ageToBeHokage( 70);
        System.out.println("But I'm just " + Naruto.age + " years and I have left "  + howManyYears + " years");

        Ninja Sasuke = new Ninja();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.village = "Konoha";
        Sasuke.age = 18;

        //calling the method
        Sasuke.SharinganON();

        Ninja Sakura = new Ninja();
        Sakura.name = "Sakura Haruno";
        Sakura.village = "Konoha";
        Sakura.age = 18;

    }
}

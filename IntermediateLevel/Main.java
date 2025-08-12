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

        //how can i create a great amount of ninja? objects!

        //object 1
        Ninja Naruto = new Ninja();
        Naruto.name = "Naruto Uzumaki";
        Naruto.village = "Konoha";
        Naruto.age = 17;

        //calling the string method
        String shouting = Naruto.hokage();
        System.out.println(shouting);

        //calling the int method
        int howManyYears = Naruto.ageToBeHokage( 70);
        System.out.println("But I'm just " + Naruto.age + " years and I have left "  + howManyYears + " years");

        //object 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.village = "Konoha";
        Sasuke.age = 18;
        Sasuke.shariganON();

        //calling the method
        Sasuke.chakra();

        //object 3
        Ninja Sakura = new Ninja();
        Sakura.name = "Sakura Haruno";
        Sakura.village = "Konoha";
        Sakura.age = 18;

        //object 4
        Hyuga Hinata = new Hyuga();
        Hinata.name = "Hinata Hyuga";
        Hinata.village = "Konoha";
        Hinata.age = 17;
        String byakugan = Hinata.byakuganON();
        System.out.println("My name is " + Hinata.name + " and my " + byakugan);

        //object 5 (interface)
        Boruto Boruto = new Boruto();
        Boruto.name = "Boruto Uzumaki";
        Boruto.age = 9;
        Boruto.village = "Konoha";
        Boruto.activateKarma();
        Boruto.activateJougan();
        Boruto.byakuganON();


    }
}

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
        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.village = "Konoha";
        naruto.age = 17;
        naruto.chakra();

        //calling the string method
        String shouting = naruto.hokage();
        System.out.println(shouting);

        //calling the int method
        int howManyYears = naruto.ageToBeHokage( 70);
        System.out.println("But I'm just " + naruto.age + " years and I have left "  + howManyYears + " years");

        //object 2
        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.village = "Konoha";
        sasuke.age = 18;
        sasuke.sharinganON();

        //calling the method, overwritten
        sasuke.chakra();

        //object 3
        Ninja sakura = new Ninja();
        sakura.name = "Sakura Haruno";
        sakura.village = "Konoha";
        sakura.age = 18;
        sakura.chakra();

        //object 4(using heredity)
        Hyuga hinata = new Hyuga();
        hinata.name = "Hinata Hyuga";
        hinata.village = "Konoha";
        hinata.age = 17;
        String byakugan = hinata.byakuganON();
        System.out.println("My name is " + hinata.name + " and my " + byakugan);
        hinata.chakra();

        //object 5(interface)
        Boruto boruto = new Boruto();
        boruto.name = "Boruto Uzumaki";
        boruto.age = 9;
        boruto.village = "Konoha";
        boruto.activateKarma();
        boruto.activateJougan();
        boruto.byakuganON();
        boruto.chakra();

        //object 6(using constructors)
        Senju tobirama = new Senju("Tobirama", 50, false);
        System.out.println(tobirama.name);
        System.out.println(tobirama.age);
        System.out.println(tobirama.alive);

        //object 7(class abstract) with no args
        Senju hashirama = new Senju();
        hashirama.wisdom();

        //object 8(multiple hereditary)
        Hatake kakashi = new Hatake();
        kakashi.sharinganON();
        kakashi.anbuNinja();
        kakashi.hokageON();

    }
}

package IntermediateLevel5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //array are static, can't grow or shrink
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        ninjasArray[3] = "Kakashi";
        //this will not work, you have to select [0], [1], some index
        System.out.println("The ninja is: " + ninjasArray);

        //list aren't so they can grow or shrink
        List<String> ninjasList = new ArrayList<>();
        //you can add
        ninjasList.add("Naruto Uzumaki");   //index 0
        ninjasList.add("Sasuke Uchiha");    //index 1
        ninjasList.add("Sakura Haruno");    //index 2
        ninjasList.add("Kakashi Hatake");   //index 3
        //this will work on a list cause toString is already in the list
        System.out.println("The ninjas are: " + ninjasList);

        //to swap things
        ninjasList.set(3, "Iruka");
        System.out.println("The ninjas are: " + ninjasList);

        //or remove
        ninjasList.remove("Iruka");
        System.out.println("The ninjas are: " + ninjasList);

        //and to see the size of it
        System.out.println("The size of the list is: " + ninjasList.size() + " elements");

        Kunai kunai1 = new Kunai("first");
        Kunai kunai2 = new Kunai("second");
        Kunai kunai3 = new Kunai("third");

        BagKunai kunais = new BagKunai();
        kunais.addKunai(kunai1);
        kunais.addKunai(kunai2);
        kunais.addKunai(kunai3);
        System.out.println("The kunais are: " + kunais);

        Shuriken shuriken1 = new Shuriken("air");
        Shuriken shuriken2 = new Shuriken("ground");
        Shuriken shuriken3 = new Shuriken("fire");

        BagShuriken shurikens = new BagShuriken();
        shurikens.addShuriken(shuriken1);
        shurikens.addShuriken(shuriken2);
        shurikens.addShuriken(shuriken3);
        System.out.println("The shurikens are: " + shurikens);

        Scroll scroll1 = new Scroll("restrict");
        Scroll scroll2 = new Scroll("forbidden");
        Scroll scroll3 = new Scroll("normal");

        BagScroll scrolls = new BagScroll();
        scrolls.addScroll(scroll1);
        scrolls.addScroll(scroll2);
        scrolls.addScroll(scroll3);
        System.out.println("The scrolls are: " + scrolls);

    }
}

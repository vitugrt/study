package src.DataType;

public class Arrays {
    public static void main(String[] args) {

        /*
        without array usage, the code can't escalate

        String ninja1 = "Naruto Uzumaki";
        String ninja2 = "Sasuke Uchiha";
        String ninja3 = "Sakura Haruno";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);
        */

        // null
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        //System.out.println(ninja[5]);

        // redeclaring
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade Senju";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        //System.out.println(ninja[2]);

        // for to show all array value's
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        // 0
        /*
        int[] age = new int[2];
        System.out.println(age[1]);
        */

        // false
        /*
        boolean[] yesNo = new boolean[1];
        System.out.println(yesNo[0]);
        */

        // 0.0
        /*
        double[] fLOAT = new double[1];
        System.out.println(fLOAT[0]);
        */
    }
}
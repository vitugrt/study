package src.DataType;

public class Array2D {
    public static void main(String[] args) {

        /*
        (String[] ninja = new String[3];
        it's the array used as reference, that turns into a 2D array
        */

        String[][] ninjaANDVillage = new String[3][3];
        //first array
        ninjaANDVillage[0][0] = "Konoha";
        ninjaANDVillage[0][1] = "Sasuke Uchiha";
        ninjaANDVillage[0][2] = "Sakura Haruno";

        //second array
        ninjaANDVillage[1][0] = "Sound";
        ninjaANDVillage[1][1] = "Zabuza Momochi";
        ninjaANDVillage[1][2] = "Haku";

        //third array
        ninjaANDVillage[2][0] = "Desert";
        ninjaANDVillage[2][1] = "Subaku no Gaara";
        ninjaANDVillage[2][2] = "Temari";

        //prints them in loop
        for (String[] strings : ninjaANDVillage) {
            System.out.println("Village: " + strings[0] + "\nNinjas: " + strings[1] + ", " + strings[2]);
        }
    }
}

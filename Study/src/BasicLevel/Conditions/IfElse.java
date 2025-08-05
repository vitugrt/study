package src.Conditions;

public class IfElse {
    public static void main(String[] args) {

        /*
        * Objective: to gain more levels by missions completed
        *
        **/

        // ninja Naruto
        String name = "Naruto Uzumaki";
        String rank;
        int age = 16;
        boolean kage = false;
        short missions = 10;


        // if (do this)
        if ( missions >= 10 && age > 10){
            System.out.println("Rank = Chunnin!");
        } else if (missions >=20 && age > 15){
            System.out.println("Rank = Jounin!");
        }
        else {
            System.out.println("Rank = Gennin");
        }
    }
}

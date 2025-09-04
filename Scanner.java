package BasicLevel.Conditions;

public class Scanner {
    public static void main(String[] args) {
        /*
         * Scaner input method
         * Objective: user will create a ninja
         * */


        //Open Scanner
        java.util.Scanner text = new java.util.Scanner(System.in);

        System.out.println("Write the ninja name:");
        String nomeDoNinja = text.nextLine();

        System.out.println("Write the age of the ninja:");
        int idadeDoNinja = text.nextInt();

        System.out.println("The name of the ninja is: " + nomeDoNinja);
        System.out.println("The age of the ninja is: " + idadeDoNinja);

        //data treatment
        if( idadeDoNinja >= 18){
            System.out.println("It's over 18!");
        } else {
            System.out.println("You're not ready yet");
        }

        //IMPORTANT close scanner
        text.close();

    }

}

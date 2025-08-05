package src.Conditions;

public class Scanner {
    public static void main(String[] args) {
        /*
         * Scaner input method
         * Objetivo: user will create a ninja
         * */


        //Abrir Scanner
        java.util.Scanner text = new java.util.Scanner(System.in);

        //Atribuir nome ao ninja
        System.out.println("Escreva aqui o nome do ninja:");
        String nomeDoNinja = text.nextLine();

        //Atribuir idade ao ninja
        System.out.println("Escreva aqui a idade do ninja:");
        int idadeDoNinja = text.nextInt();

        System.out.println("O nome do ninja é: " + nomeDoNinja);
        System.out.println("A idade do ninja é: " + idadeDoNinja);

        //Tratamento de dados
        if( idadeDoNinja >= 18){
            System.out.println("Esse ninja já é maior de idade");
        } else {
            System.out.println("Esse ninja ainda é muito novo");
        }

        //Fechar o Scanner (não esquecer)
        text.close();

    }

}

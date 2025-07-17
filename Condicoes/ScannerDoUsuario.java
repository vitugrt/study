package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         * Scaner é um jeito de trazer o usuario para dentro da aplicação
         * Objetivo: usuario criar um ninja e os dados serem avaliados
         * */


        //Abrir Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //Atribuir nome ao ninja
        System.out.println("Escreva aqui o nome do ninja:");
        String nomeDoNinja = caixaDeTexto.nextLine();

        //Atribuir idade ao ninja
        System.out.println("Escreva aqui a idade do ninja:");
        int idadeDoNinja = caixaDeTexto.nextInt();

        System.out.println("O nome do ninja é: " + nomeDoNinja);
        System.out.println("A idade do ninja é: " + idadeDoNinja);

        //Tratamento de dados
        if( idadeDoNinja >= 18){
            System.out.println("Esse ninja já é maior de idade");
        } else {
            System.out.println("Esse ninja ainda é muito novo");
        }

        //Fechar o Scanner (não esquecer)
        caixaDeTexto.close();

    }

}

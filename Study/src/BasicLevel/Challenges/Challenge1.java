package src.Challenges;

public class Challenge1 {
    public static void main(String[] args) {

        //ninja 1

        String nomeNinja1 = "Shikamru Nara";
        int idade1 = 14;
        String missao1 = "Achar o Sasuke";
        char dificuldadeMissao1 = 'B';
        String conclusaoMissao1 = "";

        System.out.println("Eu sou " + nomeNinja1 + " minha idade é " + idade1 + " e minha missão é " + missao1);
        if (idade1 > 15) {
            if (dificuldadeMissao1 == 'D' || dificuldadeMissao1 == 'C')
                conclusaoMissao1 = "A minha missão está concluída";
        } else {
            System.out.println("A minha missão não está concluída");
        }
        //ninja 2

        String nomeNinja2 = "Neji Hyuga";
        int idade2 = 14;
        String missao2 = "Achar a Hinata";
        char dificuldadeMissao2 = 'C';
        String conclusaoMissao2 = "";

        System.out.println("Eu sou " + nomeNinja2 + " minha idade é " + idade2 + " e minha missão é " + missao2);
        if (idade2 > 15) {
            if (dificuldadeMissao2 == 'D' || dificuldadeMissao2 == 'C')
                conclusaoMissao2 = "A minha missão está concluída";
        } else {
            System.out.println("A minha missão não está concluída");
        }
        //ninja 3

        String nomeNinja3 = "Ebisu";
        int idade3 = 30;
        String missao3 = "Derrotar um jounin da Areia";
        char dificuldadeMissao3 = 'S';
        String conclusaoMissao3 = "";

        System.out.println("Eu sou " + nomeNinja3 + " minha idade é " + idade3 + " e minha missão é " + missao3);
        if (idade3 > 15) {
            if (dificuldadeMissao3 == 'D' || dificuldadeMissao3 == 'C')
                conclusaoMissao3 = "A minha missão está concluída";
        } else {
            System.out.println("A minha missão não está concluída");
        }
            System.out.println(conclusaoMissao3);
    }
}

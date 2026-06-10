package Java2026.desafioHerança;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public String mostrarHabilidadeEspecial(){
        return "Meu sharingan está ativado";
    }

    public void mostrarInformacoes(){
        System.out.println("O nome do ninja é " + nome + "\na sua idade é " + idade + "\na sua missão é " + missao + "\ne o nível dela é " + nivelMissao + "\ne a minha habilidade é " + mostrarHabilidadeEspecial());
    }
}

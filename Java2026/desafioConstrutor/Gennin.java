package Java2026.desafioConstrutor;

public class Gennin implements Ninja{

    String nome;
    int idade;
    String habilidade;

    public Gennin(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformação() {
        System.out.println("O nome do ninja é " + nome + " e a sua idade é " + idade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Já a sua habilidade especial é " + habilidade);
    }
}


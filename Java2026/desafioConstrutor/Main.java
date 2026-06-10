package Java2026.desafioConstrutor;

public class Main {
    public static void main(String[] args) {

        Gennin naruto = new Gennin("Naruto Uzumaki", 16, "Invocar clones");
        naruto.mostrarInformação();
        naruto.executarHabilidade();

        Chunnin shikamaru = new Chunnin("Shikamaru Naara", 17, "Jutsu das Sombras", "Inteligência");
        shikamaru.mostrarInformação();
        shikamaru.executarHabilidade();

    }
}
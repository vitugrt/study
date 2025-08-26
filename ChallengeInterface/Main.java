package ChallengeInterface;

public class Main {
    public static void main(String[] args) {
        Genin Naruto = new Genin("Naruto Uzumaki", 13, "Kurama");
        Naruto.showInfo();
        Naruto.useAbility();

        Chunnin Shikamaru = new Chunnin("Shikamaru Naara", 14, "Shadow Jutsu", "my mind");
        Shikamaru.showInfo();
        Shikamaru.useAbility();
    }
}

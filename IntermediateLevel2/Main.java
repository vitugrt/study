package IntermediateLevel2;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto", 16, "Konoha", 10, 1.56);
        System.out.println("My name is " + naruto.getName());
        naruto.setName("Naruto Uzumaki");
        System.out.println("And my full name is " + naruto.getName());
        naruto.setName(12);
    }
}

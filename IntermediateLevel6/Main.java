package IntermediateLevel6;

public class Main {
    public static void main(String[] args) {

        Equipments kunai = new Equipments("Kunai");
        Equipments shuriken = new Equipments("Shuriken");
        Equipments scroll = new Equipments("Scroll");

        GenericBag<Equipments> genericBag = new GenericBag<>();
        genericBag.addEquipments(kunai);
        genericBag.addEquipments(shuriken);
        genericBag.addEquipments(scroll);
        
        System.out.println(genericBag);
    }
}

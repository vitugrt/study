package IntermediateLevel7;

public class Main {
    public static void main(String[] args) {
        //super class object so we can use different object types
        GenericBag<Object>  genericBag = new GenericBag<>();
        genericBag.addEquipment(new Kunai("Explosive"));
        genericBag.addEquipment(new Shuriken(4));
        genericBag.addEquipment(new Scroll("Shadow Clone Instruction"));
        genericBag.addEquipment(new Invocation(false));
        //GenericBag(Class) > genericBag(Object) > addEquipment(Method) > new Object(Change to other class)

        System.out.println("The equipments are:");
        genericBag.showEquipments();
    }
}

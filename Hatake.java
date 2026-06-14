package IntermediateLevel;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface{
    public void sharinganON(){
        System.out.println("Sharingan is being used");
    }

    @Override
    public void anbuNinja() {
        System.out.println("I'm part of ANBU");
    }

    @Override
    public void hokageON() {
        System.out.println("I'm a Hokage in Konoha");
    }
}

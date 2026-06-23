package IntermediateLevel7;

public class Kunai {
    private String name;

    public Kunai(String name){
       this.name = name;
    }

    public String getKunai(){
        return name;
    }

    @Override
    public String toString(){
        return "Kunai: " + name;
    }
}
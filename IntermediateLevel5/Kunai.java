package IntermediateLevel5;

public class Kunai {
    private String name;

    public Kunai(){

    }

    public Kunai(String name){
       this.name = name;
    }

    public String getKunai(){
        return name;
    }

    public void setKunai(){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Kunai: " + name;
    }
}
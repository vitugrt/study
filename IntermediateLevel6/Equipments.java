package IntermediateLevel6;

public class Equipments {
    private String name;

    public Equipments(){
    }

    public Equipments(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Equipment: " + name;
    }
}

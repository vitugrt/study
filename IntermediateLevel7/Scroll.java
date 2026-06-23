package IntermediateLevel7;

public class Scroll {
    private String name;

    public Scroll(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Scroll: " + name;
    }
}



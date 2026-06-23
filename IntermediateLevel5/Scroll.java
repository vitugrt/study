package IntermediateLevel5;

public class Scroll {
    private String name;

    public Scroll(){

    }

    public Scroll(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this. name = name;
    }

    @Override
    public String toString(){
        return "Scroll: " + name;
    }
}



package IntermediateLevel2;

public class Ninja {
    //private atributes
    private String name;
    private int age;
    private String village;
    private int misionsDone;
    private double height;

    public Ninja(){

    }

    public Ninja(String name, int age, String village, int misionsDone, double height){
        this.name = name;
        this.age = age;
        this.village = village;
        this.misionsDone = misionsDone;
        this.height = height;
    }

    //to get a name from private, or to show them       get[variableName]
    public String getName(){
        return name;
    }

    //to set a name in private, where you receive values           set[variableName]
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVillage(){
        return village;
    }

    public void setVillage(String village){
        this.village = village;
    }

    public int getMisionsDone(){
        return misionsDone;
    }

    public void setMisionsDone(int misionsDone) {
        this.misionsDone = misionsDone;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }
}



package IntermediateLevel;

public class Ninja {

    //
    String name;
    String village;
    int age;

    //creating a public personalized method
    public void chakra(){
        System.out.println("Chakra is being used!");
    };

    //string method that will return a string
    public String hokage(){
        return "I want to be a hokage!";
    };

    //string method that will return an int
    public int ageToBeHokage (int ageMinimumToBeHokage){
        return  ageMinimumToBeHokage - age;
    };
}


package IntermediateLevel4;

public class Mission {
    private String name;
    private Rank rank;

    public void ShowInfo(){
        System.out.println("Mission's name: " + name + "\nMission's rank: " + rank);
        System.out.println("The kind of mission is " + rank.getDescription() + " and the level is " + rank.getDifficulty() );
    }

    public Mission(String name, Rank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public Rank getRank(){
        return rank;
    }

    public void setRank(){
        this.rank = rank;
    }
}

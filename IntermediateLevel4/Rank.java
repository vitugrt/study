package IntermediateLevel4;

public enum Rank {
    //can only be declared once
    D("Very easy", 1),
    C("Easy", 3),
    B("Medium", 5),
    A("Hard", 8),
    S("Very hard", 10);

    private String description;
    private int difficulty;

    Rank(String description, int difficulty){
        this.description = description;
        this.difficulty = difficulty;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getDifficulty(){
        return difficulty;
    }

    public void setDifficulty(int difficulty){
        this.difficulty = difficulty;
    }
}

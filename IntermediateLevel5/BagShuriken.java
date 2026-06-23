package IntermediateLevel5;

import java.util.ArrayList;
import java.util.List;

public class BagShuriken {
    private List<Shuriken> shurikens;

    public BagShuriken(){
        shurikens = new ArrayList<>();
    }

    public void addShuriken(Shuriken shuriken){
        shurikens.add(shuriken);
    }

    public List<Shuriken> getShuriken(){
        return shurikens;
    }

    public void setShuriken(List<Shuriken> shurikens){
        this.shurikens = shurikens;
    }

    @Override
    public String toString(){
        return "Shuriken: " + shurikens.toString();
    }
}


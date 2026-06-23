package IntermediateLevel5;

import java.util.ArrayList;
import java.util.List;

public class BagKunai {
    private List<Kunai> kunais;

    public BagKunai(){
        this.kunais = new ArrayList<>();
    }

    public void addKunai(Kunai kunai){
        kunais.add(kunai);
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais){
        this.kunais = kunais;
    }

    @Override
    public String toString(){
        return "Bag of Kunai: " + kunais.toString();
    }
}

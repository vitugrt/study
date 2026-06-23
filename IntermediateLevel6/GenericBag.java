package IntermediateLevel6;

import java.util.ArrayList;
import java.util.List;

public class GenericBag<T> {
    private List<T> equipments;


    public GenericBag() {
        this.equipments = new ArrayList<>();
    }

    public void addEquipments(T equipmentGeneric){
        equipments.add(equipmentGeneric);
    }

    public List<T> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<T> equipments) {
        this.equipments = equipments;
    }

    @Override
    public String toString(){
        return "Bag of generic equipments: " + equipments.toString();
    }
}

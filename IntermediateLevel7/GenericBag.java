package IntermediateLevel7;

import java.util.ArrayList;
import java.util.List;

public class GenericBag<T> {
    //initiate array
    private List<T> equipments;

    //constructor without args
    public GenericBag(){
        this.equipments = new ArrayList<>();
    }

    //add equipments to the array
    public void addEquipment(T equipment){
        equipments.add(equipment);
    }

    //show equipments
    public void showEquipments(){
        for (T equipment : equipments){
            System.out.println(equipment);
        }
    }
}

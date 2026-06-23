package IntermediateLevel5;

import java.util.ArrayList;
import java.util.List;

public class BagScroll {
    private List<Scroll> scrolls;

    public BagScroll(){
        scrolls = new ArrayList<>();
    }

    public void addScroll(Scroll scroll){
        scrolls.add(scroll);
    }

    public List<Scroll> getScroll(){
        return scrolls;
    }

    public void setScroll(List<Scroll> scroll){
        this.scrolls = scrolls;
    }

    public String toString(){
        return "Scroll: " + scrolls.toString();
    }

}

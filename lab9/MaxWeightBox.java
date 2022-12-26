package week12;


import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private List<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        if (thing.getWeight() <= maxWeight) {
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false; 
    }
}

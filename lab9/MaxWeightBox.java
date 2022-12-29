package week12;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
    private final double maxWeight;
    private final List<Thing> things;

    public MaxWeightBox(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        if (things.stream().mapToDouble(Thing::getWeight).sum() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
}
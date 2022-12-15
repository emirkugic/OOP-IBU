package week10;
import java.util.ArrayList;

public class Box {
    private ArrayList<ToBeStored> things;
    private double maximumWeight;

    public Box(double maxWeight) {
        this.things = new ArrayList<ToBeStored>();
        this.maximumWeight = maxWeight;
    }

    
    
// Check if the total weight of the box and the thing to be added is greater than the maximum weight
// If it is, print "Full", otherwise, add the thing to the box

    public void add(ToBeStored thing) {
        if((this.totalWeight() + thing.weight()) > this.maximumWeight) {
            System.out.println("Full");
        } else {
            this.things.add(thing);
        }
    }

    
// Calculate the total weight of the things in the box
    public double totalWeight() {
        double total = 0;
        for(ToBeStored toBeStored : things) {
            total += toBeStored.weight();
        }
        return total;
    }
    
    
// Return a string with the number of things in the box and the total weight
    public String toString() {
        return "Number of things " + this.things.size() + ", total weight: " + this.totalWeight();
    }
}

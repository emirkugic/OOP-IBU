package week12;

import java.util.Random;

public class Cow implements Milkable, Alive {
	
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", 
        "Ilo",  "Jaana", "Jami", "Jatta", "Laku", "Liekki",  "Mainikki", 
        "Mella", "Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", 
        "Pulu", "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    private String name;
    private double udderCapacity;
    private double milk;

    public Cow() {
        int randomIndex = new Random().nextInt(NAMES.length);
        this.name = NAMES[randomIndex];
        this.udderCapacity = 15 + new Random().nextInt(26);
        this.milk = 0.0;
    }

    public Cow(String name) {
        this.name = name;
        this.udderCapacity = 15 + new Random().nextInt(26);
        this.milk = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCapacity;
    }

    public double getAmount() {
        return milk;
    }
    @Override
    public double milk() {
        double all = milk;
        milk = 0.0;
        return all;
    }
    
    @Override
    public void liveHour() {
        milk += 0.7 + new Random().nextInt(2);
        if (milk > udderCapacity) {
            milk = udderCapacity;
        }
    }
    @Override
    public String toString() {
        return name + " " + Math.ceil(milk) + "/" + Math.ceil(udderCapacity);
    }
}


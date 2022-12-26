package week12;

import java.text.DecimalFormat;

public class BulkTank {
  private double capacity;
  private double volume;
  private DecimalFormat df = new DecimalFormat("#.##");

  public BulkTank() {
    this.capacity = 2000;
    this.volume = 0;
  }

  public BulkTank(double capacity) {
    this.capacity = capacity;
    this.volume = 0;
  }

  public double getCapacity() {
    return capacity;
  }

  public double getVolume() {
    return volume;
  }

  public double howMuchFreeSpace() {
    return capacity - volume;
  }

  public void addToTank(double amount) {
    if (amount > 0) {
      if (amount > howMuchFreeSpace()) {
        volume = capacity;
      } else {
        volume += amount;
      }
    }
  }
  public double getFromTank(double amount) {
	    if (amount < 0) {
	      return 0;
	    }
	    if (amount > volume) {
	      double allThereIs = volume;
	      volume = 0;
	      return allThereIs;
	    }
	    volume -= amount;
	    return amount;
	  }

	  @Override
	  public String toString() {
	    return df.format(volume) + "/" + df.format(capacity);
	  }
	}

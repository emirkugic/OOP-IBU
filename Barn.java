package week12;

import java.util.Collection;

public class Barn {
  private BulkTank bulkTank;
  private MilkingRobot milkingRobot;

  public Barn(BulkTank tank) {
    this.bulkTank = tank;
    this.milkingRobot = null;
  }

  public BulkTank getBulkTank() {
    return bulkTank;
  }

  public void installMilkingRobot(MilkingRobot milkingRobot) {
    this.milkingRobot = milkingRobot;
    milkingRobot.setBulkTank(bulkTank);
  }

  public void takeCareOf(Cow cow) {
    if (milkingRobot == null) {
      throw new IllegalStateException("The milking robot hasn't been installed");
    }

    milkingRobot.milk(cow);
  }

  public void takeCareOf(Collection<Cow> cows) {
    if (milkingRobot == null) {
      throw new IllegalStateException("The milking robot hasn't been installed");
    }

    for (Cow cow: cows) {
      milkingRobot.milk(cow);
    }
  }

  @Override
  public String toString() {
    return bulkTank.toString();
  }
}

package week12;

public class MilkingRobot {
	  private BulkTank bulkTank;

	  public MilkingRobot() {
	    this.bulkTank = null;
	  }

	  public BulkTank getBulkTank() {
	    return bulkTank;
	  }

	  public void setBulkTank(BulkTank bulkTank) {
	    this.bulkTank = bulkTank;
	  }

	  public void milk(Milkable milkable) {
	    if (bulkTank == null) {
	      throw new IllegalStateException("The MilkingRobot hasn't been installed");
	    }

	    bulkTank.addToTank(milkable.milk());
	  }
	}

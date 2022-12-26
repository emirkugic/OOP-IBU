package week12;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {
  private String owner;
  private Barn barn;
  private List<Cow> herd;

  public Farm(String owner, Barn barn) {
    this.owner = owner;
    this.barn = barn;
    this.herd = new ArrayList<>();
  }

  public String getOwner() {
    return owner;
  }

  public void addCow(Cow cow) {
    herd.add(cow);
  }

  public void manageCows() {
    barn.takeCareOf(herd);
  }

  @Override
  public void liveHour() {
    for (Cow cow : herd) {
      cow.liveHour();
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Farm owner: ").append(owner).append("\n");
    sb.append("Barn bulk tank: ").append(barn.getBulkTank()).append("\n");
    if (herd.isEmpty()) {
      sb.append("No cows.\n");
    } else {
      sb.append("Animals:\n");
      for (Cow cow : herd) {
        sb.append("   ").append(cow).append("\n");
      }
    }
    return sb.toString();
  }
}

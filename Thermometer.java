package week11;

import java.util.Random;

public class Thermometer implements Sensor {
  private boolean isOn;
  private final Random random;

  public Thermometer() {
    this.isOn = false;
    this.random = new Random();
  }

  @Override
  public boolean isOn() {
    return isOn;
  }

  @Override
  public void on() {
    isOn = true;
  }

  @Override
  public void off() {
    isOn = false;
  }

  @Override
  public int measure() {
    if (!isOn) {
      throw new IllegalStateException("Thermometer is off");
    }
    return random.nextInt(61) - 30;
  }
}


package week11;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
  private boolean isOn;
  private final List<Sensor> sensors;
  private final List<Integer> readings;

  public AverageSensor() {
    this.isOn = false;
    this.sensors = new ArrayList<>();
    this.readings = new ArrayList<>();
  }

  public void addSensor(Sensor additional) {
    sensors.add(additional);
  }

  public List<Integer> readings() {
    return readings;
  }

  @Override
  public boolean isOn() {
    for (Sensor sensor : sensors) {
      if (!sensor.isOn()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public void on() {
    for (Sensor sensor : sensors) {
      sensor.on();
    }
  }

  @Override
  public void off() {
    for (Sensor sensor : sensors) {
      sensor.off();
    }
  }

  @Override
  public int measure() {
    if (!isOn()) {
      throw new IllegalStateException("Average sensor is off");
    }
    if (sensors.isEmpty()) {
      throw new IllegalStateException("Average sensor has no sensors");
    }
    int sum = 0;
    for (Sensor sensor : sensors) {
      sum += sensor.measure();
    }
    int reading = sum / sensors.size();
    readings.add(reading);
    return reading;
  }
}

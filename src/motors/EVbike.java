package motors;

public class EVbike extends  BasicInfo{
    private  float batteryHours;

    public float getBatteryHours() {
        return batteryHours;
    }

    public void setBatteryHours(float batteryHours) {
        this.batteryHours = batteryHours;
    }

    @Override
    public String toString() {
        return "EVbike{" +
                "batteryHours=" + batteryHours +
                '}';
    }
}

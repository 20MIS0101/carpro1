package motors;

public class PertolBike extends BasicInfo{
    private String engineName;
    private float tankCapacity;

    public float getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(float tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Override
    public String toString() {
        return "PertolBike{" +
                "engineName='" + engineName + '\'' +
                ", tankCapacity=" + tankCapacity +
                '}';
    }
}

package robotSample;

public class RobotFeature {

    //Pvz feature gali buti spotify, youtube, navigation, calculator..
    private String name;

    public RobotFeature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "robotSample.RobotFeature{" +
                "name='" + name + '\'' +
                '}';
    }
}

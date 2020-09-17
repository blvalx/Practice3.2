public class Leg {
    private double length;
    private String mainLeg;

    public Leg(double length, String mainLeg) {
        this.length = length;
        this.mainLeg = mainLeg;
    }

    public String getMainLeg() {
        return mainLeg;
    }

    public void setMainLeg(String mainLeg) {
        this.mainLeg = mainLeg;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Длина ноги: " + length +
                " см., Ведущая нога: " + mainLeg;
    }
}

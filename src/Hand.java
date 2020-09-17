public class Hand {
    private double length;
    private String mainHand;

    public Hand(double length, String mainHand) {
        this.length = length;
        this.mainHand = mainHand;
    }

    public String getMainHand() {
        return mainHand;
    }

    public void setMainHand(String mainHand) {
        this.mainHand = mainHand;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Длина руки: " + length +
                " см., Ведущая рука: " + mainHand;
    }
}

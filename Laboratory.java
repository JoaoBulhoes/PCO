public class Laboratory {
    private String Name;
    private String Surveillance;

    @Override
    public String toString() {
        return "Laboratory{" +
                "Name='" + Name + '\'' +
                ", Surveillance='" + Surveillance + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public String getSurveillance() {
        return Surveillance;
    }
}

public class Laboratory {
    private String Name;
    private String Surveillance;

    @Override
    public String toString() {
        return "Laboratory{" +
                "\n  Name='" + Name + '\'' +
                "\n  Surveillance='" + Surveillance + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public String getSurveillance() {
        return Surveillance;
    }
}

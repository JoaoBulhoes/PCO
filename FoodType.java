public class FoodType {
    private String Type;

    public FoodType(String Type) {
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "FoodType{" +
                "Type='" + Type + '\'' +
                '}';
    }

    public Object getType() {
        return Type;
    }
}

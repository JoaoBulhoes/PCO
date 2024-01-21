import java.util.ArrayList;
import java.util.List;

public class FoodTypeList {
    ArrayList<FoodType> foodTypes;

    public FoodTypeList() {
        foodTypes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "FoodTypeList{" +
                "foodTypes=" + foodTypes +
                '}';
    }

    public void add(FoodType foodType) {
        foodTypes.add(foodType);
    }

    public int size() {
        return foodTypes.size();
    }

    public FoodType get(int i) {
        return foodTypes.get(i);
    }

    public List<FoodType> getList() {
        return foodTypes;
    }
}

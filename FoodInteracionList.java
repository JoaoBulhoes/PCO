import java.util.ArrayList;
import java.util.List;

public class FoodInteracionList {
    ArrayList<FoodInteraction> foodInteractions;

    @Override
    public String toString() {
        return "FoodInteracionList{" +
                "foodInteractions=" + foodInteractions +
                '}';
    }

    public void add(FoodInteraction foodInteraction) {
        foodInteractions.add(foodInteraction);
    }

    public List<FoodInteraction> getList() {
        return foodInteractions;
    }
}

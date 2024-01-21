import java.util.ArrayList;
import java.util.List;

public class DrugList {
    ArrayList<Drug> drugs;

    @Override
    public String toString() {
        return "DrugList{" +
                "drugs=" + drugs +
                '}';
    }

    public void add(Drug drug) {
        drugs.add(drug);
    }

    public List<Drug> getList() {
        return drugs;
    }
}

import java.util.ArrayList;
import java.util.List;

public class LaboratoriesList {
    ArrayList<Laboratory> laboratories;

    @Override
    public String toString() {
        return "LaboratoriesList{" +
                "laboratories=" + laboratories +
                '}';
    }

    public List<Laboratory> getList() {
        return laboratories;
    }
}

import java.util.ArrayList;
import java.util.List;

public class SubstancesList {
    ArrayList<Substance> substances;

    @Override
    public String toString() {
        return "SubstancesList{" +
                "substances=" + substances +
                '}';
    }

    public int size() {
        return substances.size();
    }

    public Substance get(int i) {
        return substances.get(i);
    }

    public void add(Substance substance) {
        substances.add(substance);
    }

    public List<Substance> getList() {
        return substances;
    }

}

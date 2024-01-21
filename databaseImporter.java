import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class databaseImporter {
    private static Gson gson = new Gson();

    public static SubstancesList importSubstances() {
        // carregar substancias
        try (FileReader reader = new FileReader("src/dataset.json")) {
            return gson.fromJson(reader, SubstancesList.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static LaboratoriesList importLaboratories() {
        // carregar laboratorios
        try (FileReader reader = new FileReader("src/dataset.json")){
            return gson.fromJson(reader, LaboratoriesList.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static FoodTypeList importFoodTypes() {
        // carregar food Types
        try (FileReader reader = new FileReader("src/dataset.json")){
            return gson.fromJson(reader, FoodTypeList.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static FoodInteracionList importFoodInteractions() {
        // carregar interacoes alimentares
        try (FileReader reader = new FileReader("src/dataset.json")){
            return gson.fromJson(reader, FoodInteracionList.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static DrugList importDrugs() {
        // carregr medicamentos
        try (FileReader reader = new FileReader("src/dataset.json")){
            return gson.fromJson(reader, DrugList.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

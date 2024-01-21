import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class teste {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // carregr medicamentos
        try (FileReader reader = new FileReader("src/dataset.json")){
            DrugList m = gson.fromJson(reader, DrugList.class);
//            System.out.println(m);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // carregar interacoes alimentares
        try (FileReader reader = new FileReader("src/dataset.json")){
            FoodInteracionList m = gson.fromJson(reader, FoodInteracionList.class);
//            System.out.println(m);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // carregar food Types
        try (FileReader reader = new FileReader("src/dataset.json")){
            FoodTypeList m = gson.fromJson(reader, FoodTypeList.class);
//            System.out.println(m);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // carregar laboratorios
        try (FileReader reader = new FileReader("src/dataset.json")){
            LaboratoriesList m = gson.fromJson(reader, LaboratoriesList.class);
//            System.out.println(m);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // carregar substancias
        try (FileReader reader = new FileReader("src/dataset.json")){
            SubstancesList m = gson.fromJson(reader, SubstancesList.class);
            System.out.println(m);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

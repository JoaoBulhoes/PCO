/**
 * The type Drug.
 */
public class Drug {
    private String Name;
    private String Form;
    private String Dosage;
    private String Laboratory;
    private String Substances;

    public Drug(String name, String form, String dosage, String laboratory, String substances) {
        Name = name;
        Form = form;
        Dosage = dosage;
        Laboratory = laboratory;
        Substances = substances;
    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets nome.
     *
     * @param name the nome
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     * Gets forma farmaceutica.
     *
     * @return the forma farmaceutica
     */
    public String getForm() {
        return Form;
    }

    /**
     * Sets forma farmaceutica.
     *
     * @param form the forma farmaceutica
     */
    public void setForm(String form) {
        this.Form = form;
    }

    /**
     * Gets dosagem.
     *
     * @return the dosagem
     */
    public String getDosage() {
        return Dosage;
    }

    /**
     * Sets dosagem.
     *
     * @param dosage the dosagem
     */
    public void setDosage(String dosage) {
        this.Dosage = dosage;
    }

    /**
     * Gets substancias.
     *
     * @return the substancias
     */
    public String getSubstances() {
        return Substances;
    }

    /**
     * Gets laboratory.
     *
     * @return the laboratory
     */
    public String getLaboratory() {
        return Laboratory;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "Name='" + Name + '\'' +
                ", Form='" + Form + '\'' +
                ", Dosage='" + Dosage + '\'' +
                ", Laboratory='" + Laboratory + '\'' +
                ", Substances='" + Substances + '\'' +
                '}';
    }
}
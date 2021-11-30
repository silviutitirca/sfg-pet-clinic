package guru.springframework.sfgpetclinic.model;

/**
 * @author Silviu_Titirca on 11/30/2021
 */
public class Speciality extends BaseEntity{
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

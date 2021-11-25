package guru.springframework.sfgpetclinic.model;

/**
 * @author Silviu_Titirca on 11/24/2021
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

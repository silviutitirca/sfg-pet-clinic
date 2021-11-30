package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * @author Silviu_Titirca on 11/30/2021
 */
public class Visit extends BaseEntity{
    private LocalDate date;
    private String description;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

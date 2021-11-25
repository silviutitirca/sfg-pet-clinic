package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * @author Silviu_Titirca on 11/24/2021
 */
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDay;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}

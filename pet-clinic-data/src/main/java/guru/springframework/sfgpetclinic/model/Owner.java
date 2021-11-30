package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * @author Silviu_Titirca on 11/24/2021
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}

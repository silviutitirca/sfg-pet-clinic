package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * @author Silviu_Titirca on 11/24/2021
 */
public class Vet extends Person{
    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}

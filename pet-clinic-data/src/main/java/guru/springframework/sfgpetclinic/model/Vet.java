package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Silviu_Titirca on 11/24/2021
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "vets")
public class Vet extends Person{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
    inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

}

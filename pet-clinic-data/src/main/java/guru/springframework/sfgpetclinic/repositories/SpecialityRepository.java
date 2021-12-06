package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Silviu_Titirca on 12/6/2021
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}

package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Silviu_Titirca on 12/6/2021
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}

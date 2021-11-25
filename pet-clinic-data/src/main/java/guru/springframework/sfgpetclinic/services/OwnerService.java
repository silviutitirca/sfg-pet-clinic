package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * @author Silviu_Titirca on 11/25/2021
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}

package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * @author Silviu_Titirca on 11/25/2021
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}

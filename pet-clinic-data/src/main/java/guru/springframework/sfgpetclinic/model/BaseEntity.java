package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author Silviu_Titirca on 11/25/2021
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

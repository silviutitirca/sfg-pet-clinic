package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Silviu_Titirca on 11/26/2021
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index","/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}

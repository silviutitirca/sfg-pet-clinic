package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Silviu_Titirca on 11/26/2021
 */
@Controller
public class OwnerController {

    @RequestMapping({"/owners", "owners/index", "owners/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}

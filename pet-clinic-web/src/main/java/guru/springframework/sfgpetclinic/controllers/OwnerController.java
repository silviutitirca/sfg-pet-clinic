package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Silviu_Titirca on 11/26/2021
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    private final OwnerService ownerService;

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}

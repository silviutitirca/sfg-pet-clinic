package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Silviu_Titirca on 11/25/2021
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public  String index(){
        return  "index";
    }

}

package az.spring.pet.clinic.jafar.sfgpetclinic.controllers;

import az.spring.pet.clinic.jafar.sfgpetclinic.service.IVetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/vets"})
@Controller
public class VetsController {
    private final IVetService iVetService;

    @Autowired
    public VetsController(@Qualifier("vetServiceMap") IVetService iVetService) {
        this.iVetService = iVetService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String index(Model model)
    {
        model.addAttribute("vets",iVetService.findAll());
        return "vets/index";
    }
}

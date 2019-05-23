package az.spring.pet.clinic.jafar.sfgpetclinic.controllers;


import az.spring.pet.clinic.jafar.sfgpetclinic.service.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController  {

    private final IOwnerService iOwnerService;

    @Autowired
    public OwnerController(@Qualifier("ownerServiceMap") IOwnerService iOwnerService) {
        this.iOwnerService = iOwnerService;
    }


    @RequestMapping({"","/","/index","/index.html"})
    public String index(Model model)
    {
        model.addAttribute("owners" , iOwnerService.findAll());
        return "owners/index";
    }


}

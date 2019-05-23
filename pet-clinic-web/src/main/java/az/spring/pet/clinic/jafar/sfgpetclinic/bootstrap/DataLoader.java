package az.spring.pet.clinic.jafar.sfgpetclinic.bootstrap;

import az.spring.pet.clinic.jafar.sfgpetclinic.model.Owner;
import az.spring.pet.clinic.jafar.sfgpetclinic.model.Vet;
import az.spring.pet.clinic.jafar.sfgpetclinic.service.IOwnerService;
import az.spring.pet.clinic.jafar.sfgpetclinic.service.IVetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {
    private final IOwnerService iOwnerService;
    private final IVetService iVetService;

    @Autowired
    public DataLoader(@Qualifier("ownerServiceMap") IOwnerService iOwnerService, @Qualifier("vetServiceMap") IVetService iVetService){
        this.iOwnerService = iOwnerService;
        this.iVetService = iVetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        iOwnerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        iOwnerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        iVetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Samanta");
        vet2.setLastName("Axel");
        iVetService.save(vet2);
    }
}

package az.spring.pet.clinic.jafar.sfgpetclinic.service.map;

import az.spring.pet.clinic.jafar.sfgpetclinic.model.Vet;
import az.spring.pet.clinic.jafar.sfgpetclinic.service.IVetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements IVetService{
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}

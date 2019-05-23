package az.spring.pet.clinic.jafar.sfgpetclinic.service;

import az.spring.pet.clinic.jafar.sfgpetclinic.model.Owner;


public interface IOwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}

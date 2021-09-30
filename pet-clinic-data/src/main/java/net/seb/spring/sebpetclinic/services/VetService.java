package net.seb.spring.sebpetclinic.services;

import net.seb.spring.sebpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{
    Vet findByLastName(String lastName);
}

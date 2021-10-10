package net.seb.spring.sebpetclinic.repositories;

import net.seb.spring.sebpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long>{
}

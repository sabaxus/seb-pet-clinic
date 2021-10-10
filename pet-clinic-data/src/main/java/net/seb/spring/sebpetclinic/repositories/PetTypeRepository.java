package net.seb.spring.sebpetclinic.repositories;

import net.seb.spring.sebpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

package net.seb.spring.sebpetclinic.repositories;

import net.seb.spring.sebpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

package net.seb.spring.sebpetclinic.repositories;

import net.seb.spring.sebpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}

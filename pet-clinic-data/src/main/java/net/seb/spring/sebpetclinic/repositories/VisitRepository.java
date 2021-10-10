package net.seb.spring.sebpetclinic.repositories;

import net.seb.spring.sebpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

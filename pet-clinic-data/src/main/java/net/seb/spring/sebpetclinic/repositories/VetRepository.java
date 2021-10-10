package net.seb.spring.sebpetclinic.repositories;

import net.seb.spring.sebpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

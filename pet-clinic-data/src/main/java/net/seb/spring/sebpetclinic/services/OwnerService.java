package net.seb.spring.sebpetclinic.services;

import net.seb.spring.sebpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}

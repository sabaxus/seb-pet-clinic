package net.seb.spring.sebpetclinic.services;

import net.seb.spring.sebpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}

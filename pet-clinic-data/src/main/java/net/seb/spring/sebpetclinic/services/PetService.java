package net.seb.spring.sebpetclinic.services;

import net.seb.spring.sebpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}

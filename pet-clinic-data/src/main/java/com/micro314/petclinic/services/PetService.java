package com.micro314.petclinic.services;

import com.micro314.petclinic.model.Pet;

import java.util.Optional;
import java.util.Set;

public interface PetService {
    Optional<Pet> findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

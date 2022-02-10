package com.micro314.petclinic.services;

import com.micro314.petclinic.model.Owner;

import java.util.Optional;
import java.util.Set;

public interface OwnerService {
    Optional<Owner> findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}

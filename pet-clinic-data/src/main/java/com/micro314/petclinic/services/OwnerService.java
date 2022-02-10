package com.micro314.petclinic.services;

import com.micro314.petclinic.model.Owner;

import java.util.Optional;

public interface OwnerService extends CrudService<Owner, Long> {
    Optional<Owner> findByLastName(String lastName);
}

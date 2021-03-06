package com.micro314.petclinic.services.map;

import com.micro314.petclinic.model.Owner;
import com.micro314.petclinic.services.CrudService;

import java.util.Optional;
import java.util.Set;

public class OwnerMapService extends MapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Optional<Owner> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

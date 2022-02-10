package com.micro314.petclinic.services.map;

import com.micro314.petclinic.model.Pet;
import com.micro314.petclinic.services.CrudService;

import java.util.Optional;
import java.util.Set;

public class PetMapService extends MapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Optional<Pet> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

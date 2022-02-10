package com.micro314.petclinic.services.map;

import com.micro314.petclinic.model.Vet;
import com.micro314.petclinic.services.CrudService;

import java.util.Optional;
import java.util.Set;

public class VetMapService extends MapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Optional<Vet> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

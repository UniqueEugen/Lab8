package org.example.service;

import org.example.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long>{
    Set<Pet> findAll();
}

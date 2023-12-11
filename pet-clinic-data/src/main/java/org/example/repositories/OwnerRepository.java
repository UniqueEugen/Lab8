package org.example.repositories;

import org.example.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    List<Owner> findAllByLastNameLike(String lastName);

}

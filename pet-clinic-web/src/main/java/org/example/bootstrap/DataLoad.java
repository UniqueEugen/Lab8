package org.example.bootstrap;

import org.example.model.Owner;
import org.example.model.Vet;
import org.example.service.OwnerService;
import org.example.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoad implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoad(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner ownerA = new Owner();
        ownerA.setFirstName("Olga");
        ownerA.setLastName("Star");
        ownerService.save(ownerA);
        System.out.println(ownerService.findAll().size());
        Vet vetA = new Vet();
        vetA.setFirstName("Dina");
        vetA.setLastName("Big");
        vetService.save(vetA);
        System.out.println(ownerService.findAll().size());
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto2.reto2.service;

import com.reto2.reto2.model.Footwears;
import com.reto2.reto2.repository.FootRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diego Garzon
 */
@Service
public class FootService {
    @Autowired
    private FootRepository footRepo;

    public List<Footwears> getAll() 
    {
        return footRepo.getAll();
    }

   public Optional<Footwears> getFoot(String reference) 
   {
        return footRepo.getFootwear(reference);
    }

    public Footwears create(Footwears foot) 
    {
        if (foot.getReference() == null) 
        {
            return foot;
        } else 
        {
            return footRepo.create(foot);
        }
    }

    public Footwears update(Footwears foot) {

        if (foot.getReference() != null) {
            Optional<Footwears> accesoryDb = footRepo.getFootwear(foot.getReference());
            if (!accesoryDb.isEmpty()) {
                
                if (foot.getBrand()!= null) {
                    accesoryDb.get().setBrand(foot.getBrand());
                }
                
                if (foot.getCategory() != null) {
                    accesoryDb.get().setCategory(foot.getCategory());
                }
                
                if (foot.getMaterial()!= null) {
                    accesoryDb.get().setMaterial(foot.getMaterial());
                }
                
                if (foot.getGender()!= null) {
                    accesoryDb.get().setGender(foot.getGender());
                }
                
                if (foot.getSize()!= null) {
                    accesoryDb.get().setSize(foot.getSize());
                }
                
                if (foot.getDescription() != null) {
                    accesoryDb.get().setDescription(foot.getDescription());
                }
                
                if (foot.getPrice() != 0.0) {
                    accesoryDb.get().setPrice(foot.getPrice());
                }
                if (foot.getQuantity() != 0) {
                    accesoryDb.get().setQuantity(foot.getQuantity());
                }
                if (foot.getPhotography() != null) {
                    accesoryDb.get().setPhotography(foot.getPhotography());
                }
                accesoryDb.get().setAvailability(foot.isAvailability());
                footRepo.update(accesoryDb.get());
                return accesoryDb.get();
            } else {
                return foot;
            }
        } else {
            return foot;
        }
    }

    public boolean delete(String reference) {
        Boolean aBoolean = getFoot(reference).map(accesory -> {
            footRepo.delete(accesory);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}

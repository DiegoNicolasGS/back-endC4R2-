/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto2.reto2.repository;

import com.reto2.reto2.model.Footwears;
import com.reto2.reto2.repository.crud.FootCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Diego Garzon
 */
@Repository
public class FootRepository 
{
    @Autowired
    private FootCrudRepository footCrudRepository;
    
    public List<Footwears> getAll() 
    {
        return footCrudRepository.findAll();
    }

    public Optional<Footwears> getFootwear(String reference) {
        return footCrudRepository.findById(reference);
    }
    
    public Footwears create(Footwears footwear) 
    {
        return footCrudRepository.save(footwear);
    }

    public void update(Footwears footwear) 
    {
        footCrudRepository.save(footwear);
    }
    
    public void delete(Footwears footwear) 
    {
        footCrudRepository.delete(footwear);
    }
}

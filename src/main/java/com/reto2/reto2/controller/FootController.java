/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto2.reto2.controller;

import com.reto2.reto2.model.Footwears;
import com.reto2.reto2.service.FootService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Diego Garzon
 */
@RestController
@RequestMapping("/api/accessory")
@CrossOrigin("*")
public class FootController {
    @Autowired
    private FootService footService;
       
    @GetMapping("/all")
    public List<Footwears> getAll() 
    {
        return footService.getAll();
    }
    
    @GetMapping("/{reference}")
    public Optional<Footwears> getClothe(@PathVariable("reference") String reference) 
    {
        return footService.getFoot(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Footwears create(@RequestBody Footwears foot) 
    {
        return footService.create(foot);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Footwears update(@RequestBody Footwears foot) 
    {
        return footService.update(foot);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) 
    {
        return footService.delete(reference);
    } 
}

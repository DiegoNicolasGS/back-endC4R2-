/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto2.reto2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Diego Garzon
 */
@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User 
{
    @Id
    /**
     * Atribute id
     */
    private Integer id;
    /**
     * Atribute Identification 
     */
    private String identification;
    /**
     * Atribute Name
     */
    private String name;
    /**
     * Atribute Adress
     */
    private String address;
    /**
     * Atribute Celphone
     */
    private String cellPhone;
    /**
     * Atribute Email
     */
    private String email;
    /**
     * Atribute Password
     */
    private String password;
    /**
     * Atribute Zone
     */
    private String zone;
    /**
     * Atribute Type    
     */
    private String type;
}

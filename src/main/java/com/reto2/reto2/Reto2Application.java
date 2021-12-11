 package com.reto2.reto2;


import com.reto2.reto2.repository.crud.FootCrudRepository;
import com.reto2.reto2.repository.crud.UserCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto2Application implements CommandLineRunner{
    @Autowired
    private UserCrudRepository userRepo;
    @Autowired
    private FootCrudRepository footRepo;
	public static void main(String[] args) {
		SpringApplication.run(Reto2Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception 
    {
        userRepo.deleteAll();
        footRepo.deleteAll();
        /*
        userRepo.saveAll(List.of(
                new User(1, "1000708973", "Juana la loca", "Cra 32 #10A - 77",
                        "3202739508", "diegogarzon006@gmai.com","Demo123.",
                        "Zona 1","ADN"),
                new User(2, "1234567891", "ABCD", "Cra 32 #10A - 77",
                        "3202739508", "pruebas1@gmai.com","Demo123.",
                        "Zona 1","ADN"),
                new User(3, "1234567892", "FGHI", "Cra 32 #10A - 77",
                        "3202739508", "pruebas2@gmai.com","Demo123.",
                        "Zona 1","ADN"),
                new User(4, "1234567893", "JKLM", "Cra 32 #10A - 77",
                        "3202739508", "pruebas3@gmai.com","Demo123.",
                        "Zona 1","ADN")
        ));
        System.out.println("Listado de usuarios");
        userRepo.findAll().forEach(System.out::println);
        
        //Prueba consultas
        Optional<User> consulta = userRepo.findByEmail("diegogarzon006@gmai.com");
        
        if(consulta.isPresent())
        {
            System.out.println("Datos del usuario" + consulta.get());
        }
        
        //Purbea consulta 2
        Optional<User> consulta1 = userRepo.findByEmailAndPassword("pruebas1@gmai.com","Demo123.");
        
        if(consulta1.isPresent())
        {
            System.out.println("Datos del usuario" + consulta1.get());
        }*/
    }

}

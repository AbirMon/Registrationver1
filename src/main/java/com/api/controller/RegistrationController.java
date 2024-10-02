package com.api.controller;

import com.api.entity.Registration;
import com.api.payload.RegistrationDto;
import com.api.service.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;
@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController{
    private RegistrationService registrationService;
    //performing dependency injection through constructor
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
    @GetMapping //it helps in getting the data from database as a json object
    public ResponseEntity<List<Registration>> getAllRegistrations(){
        List<Registration> registrations=registrationService.getRegistrations();
        return new ResponseEntity<>(registrations, HttpStatus.OK);
    }
   @PostMapping // It helps in saving the data in a database.
    public ResponseEntity<RegistrationDto>createRegistrations(@RequestBody RegistrationDto registrationDto){
       RegistrationDto regDto =  registrationService.createRegistrations(registrationDto);
       return new ResponseEntity<>(regDto,HttpStatus.CREATED);
   }
   @DeleteMapping // It helps in deleting the data from the database.
    public ResponseEntity<String>deleteRegistration(@RequestParam Long id ){
        registrationService.deleteRegistration(id);
       return new ResponseEntity<>("Deleted",HttpStatus.OK);
   }
   @PutMapping("/{id}")
    public ResponseEntity<Registration>updateRegistration(@PathVariable long id,@RequestBody Registration registration){
        Registration reg = registrationService.updateRegistration(id,registration);
        return new ResponseEntity<>(reg,HttpStatus.OK);
   }

}


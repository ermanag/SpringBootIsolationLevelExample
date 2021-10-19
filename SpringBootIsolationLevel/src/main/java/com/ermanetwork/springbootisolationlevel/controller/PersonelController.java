package com.ermanetwork.springbootisolationlevel.controller;

import com.ermanetwork.springbootisolationlevel.model.Personel;
import com.ermanetwork.springbootisolationlevel.service.PersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class PersonelController {

    @Autowired
    PersonelService personelService;

    @PostMapping("/save")
    ResponseEntity<String> savePersonel(@Valid @RequestBody Personel personel) {
        personelService.save(personel);
        return ResponseEntity.ok("Personel Ekleme Başarılı");
    }

    @DeleteMapping("/deletePerson")
    public ResponseEntity<String> deletePerson(@RequestParam Long personId){
        personelService.deletePerson(personId);
        return ResponseEntity.ok("Silme İşlemi Başarılı");
    }

}

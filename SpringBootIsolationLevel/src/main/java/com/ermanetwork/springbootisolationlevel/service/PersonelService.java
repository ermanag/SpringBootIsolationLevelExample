package com.ermanetwork.springbootisolationlevel.service;

import com.ermanetwork.springbootisolationlevel.model.Personel;
import com.ermanetwork.springbootisolationlevel.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonelService {

    @Autowired
    PersonelRepository personelRepository;


    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void save(Personel personel){
        personelRepository.save(personel);
    }

    @Transactional
    public void deletePerson(Long personId){
        personelRepository.deleteById(personId);
    }
}

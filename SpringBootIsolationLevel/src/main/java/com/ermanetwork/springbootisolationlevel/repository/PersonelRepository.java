package com.ermanetwork.springbootisolationlevel.repository;

import com.ermanetwork.springbootisolationlevel.model.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelRepository extends JpaRepository<Personel, Long> {
}

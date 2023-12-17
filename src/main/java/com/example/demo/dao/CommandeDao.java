package com.example.demo.dao;

import com.example.demo.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandeDao extends JpaRepository <Commande,Long>{
    Commande findByRef(String ref);
   List<Commande> findByRefAndTotal(String ref, double total);
   int deleteByRef(String ref);
}

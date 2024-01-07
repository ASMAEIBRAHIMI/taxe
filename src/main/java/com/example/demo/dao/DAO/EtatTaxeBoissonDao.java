package com.example.demo.dao.DAO;

import com.example.demo.bean.taxe.EtatTaxeBoisson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtatTaxeBoissonDao extends JpaRepository<EtatTaxeBoisson, Long> {
    EtatTaxeBoisson findByCode(String code);
    EtatTaxeBoisson deleteByCode(String code);
}

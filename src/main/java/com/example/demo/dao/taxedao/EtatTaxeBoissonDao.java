package com.example.demo.dao.taxedao;

import com.example.demo.bean.taxe.Categorie;
import com.example.demo.bean.taxe.EtatTaxeBoisson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatTaxeBoissonDao extends JpaRepository<EtatTaxeBoisson, Long> {

}

package com.example.demo.dao.DAO;

import com.example.demo.bean.taxe.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieDao extends JpaRepository<Categorie,Long> {
    Categorie findByCode(String code);
    int deleteByCode(String code);
}

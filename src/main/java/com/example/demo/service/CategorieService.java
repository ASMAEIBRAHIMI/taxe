package com.example.demo.service;

import com.example.demo.bean.Commande;
import com.example.demo.bean.taxe.Categorie;
import com.example.demo.dao.DAO.CategorieDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategorieDao categorieDao;
    @Transactional
    public int deleteByCode(String code) {
        return categorieDao.deleteByCode(code);
    }
    public Categorie findByCode(String code) {
        return categorieDao.findByCode(code);
    }
    public List<Categorie> findAll() {
        return categorieDao.findAll();
    }

    public int save(Categorie categorie){
        if (findByCode(categorie.getCode())!=null) return -1;
        else {
            categorieDao.save(categorie);
            return 1;
        }
    }
    public int update(Categorie categorie){
        if (findByCode(categorie.getCode())==null) return -1;
        else return 1;
    }
}

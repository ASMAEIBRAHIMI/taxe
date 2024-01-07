package com.example.demo.service;

import com.example.demo.bean.taxe.Categorie;
import com.example.demo.dao.taxedao.CategorieDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    public Categorie findByCode(String code) {
        return categorieDao.findByCode(code);
    }

    public List<Categorie> findAll() {
        return categorieDao.findAll();
    }

    @Autowired
    private CategorieDao categorieDao;

    @Transactional

    public Categorie deleteByCode(String code) {
        return categorieDao.deleteByCode(code);
    }
}

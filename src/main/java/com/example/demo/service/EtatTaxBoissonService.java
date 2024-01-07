package com.example.demo.service;

import com.example.demo.bean.taxe.EtatTaxeBoisson;
import com.example.demo.dao.DAO.EtatTaxeBoissonDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtatTaxBoissonService {
    @Autowired
    EtatTaxeBoissonDao etatTaxeBoissonDao;
    @Transactional
    public EtatTaxeBoisson deleteByCode(String code) {
        return etatTaxeBoissonDao.deleteByCode(code);
    }
    public EtatTaxeBoisson findByCode(String code) {
        return etatTaxeBoissonDao.findByCode(code);
    }
    public List<EtatTaxeBoisson> findAll() {
        return etatTaxeBoissonDao.findAll();
    }

    public int save(EtatTaxeBoisson categorie){
        if (findByCode(categorie.getCode())!=null) return -1;
        else {
            etatTaxeBoissonDao.save(categorie);
            return 1;
        }
    }
    public int update(EtatTaxeBoisson categorie){
        if (findByCode(categorie.getCode())==null) return -1;
        else return 1;
    }
}

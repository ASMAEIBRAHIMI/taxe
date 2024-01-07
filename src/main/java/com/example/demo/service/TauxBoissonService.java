package com.example.demo.service;

import com.example.demo.bean.taxe.TauxBoisson;
import com.example.demo.dao.DAO.TauxBoissonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TauxBoissonService {
    @Autowired
    private TauxBoissonDao tauxBoissonDao;

    public int save(TauxBoisson tauxBoisson) {
        if (findByCategorieCode(tauxBoisson.getCategorie().getCode()) != null) {
            return -1;
        } else {
            tauxBoissonDao.save(tauxBoisson);
            return 1;
        }
    }
    public TauxBoisson findByCategorieCode(String code) {
        return tauxBoissonDao.findByCategorieCode(code);
    }

    public List<TauxBoisson> findAll() {
        return tauxBoissonDao.findAll();
    }
}

package com.example.demo.service;

import com.example.demo.bean.taxe.Redevable;
import com.example.demo.dao.DAO.RedevableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedevableService {

    @Autowired
    public RedevableDao redevableDao;

    public Redevable findByCin(String cin) {
        return redevableDao.findByCin(cin);
    }

    public int deleteByCin(String cin) {
        return redevableDao.deleteByCin(cin);
    }

    public List<Redevable> findAll() {
        return redevableDao.findAll();
    }
}

package com.example.demo.service;


import com.example.demo.bean.Commande;
import com.example.demo.dao.CommandeDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {

    public Commande findByRef(String ref) {
        return commandeDao.findByRef(ref);
    }

    public List<Commande> findByRefAndTotal(String ref, double total) {
        return commandeDao.findByRefAndTotal(ref, total);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return commandeDao.deleteByRef(ref);
    }


    @Deprecated
    public Commande getOne(Long aLong) {
        return commandeDao.getOne(aLong);
    }

    public List<Commande> findAll() {
        return commandeDao.findAll();
    }

    public int update(Commande commande) {
        if (findByRef(commande.getRef()) == null) {
            return -1;
        } else {
            commandeDao.save(commande);
            return 1;
        }
    }

    public int save(Commande commande) {
        if (findByRef(commande.getRef()) != null) {
            return -1;
        } else if (commande.getTotal() < commande.getTotalPaye()) {
            return -2;
        } else {
            commandeDao.save(commande);
            return 1;
        }
    }

    public int payer(String ref, double mt) {
        Commande commande = findByRef(ref);
        if (commande == null) {
            return -1;
        } else if (commande.getTotalPaye() + mt > commande.getTotal()) {
            return -2;
        } else {
            double nvTotalPaye = commande.getTotalPaye() + mt;
            commande.setTotalPaye(nvTotalPaye);
            commandeDao.save(commande);
            return 1;
        }

    }


    @Autowired
    private CommandeDao commandeDao;

}

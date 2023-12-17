package com.example.demo.service;


import com.example.demo.bean.Commande;
import com.example.demo.bean.Paiement;
import com.example.demo.dao.PaiementDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementService {


    public int save(Paiement paiement, String ref) {
        Commande commande = commandeService.findByRef(ref);
        paiement.setCommande(commande);

        if (commande == null) {
            return -1;
        } else if (findByCode(paiement.getCode()) != null) {
            return -2;
        } else {
            paiementDao.save(paiement);
            double nvTotalPaye = commande.getTotalPaye() + paiement.getMontant();
            commande.setTotalPaye(nvTotalPaye);
            commandeService.update(commande);
            return 1;
        }
    }

    public Paiement findByCode(String code) {
        return paiementDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return paiementDao.deleteByCode(code);
    }

    @Deprecated
    public Paiement getOne(Long aLong) {
        return paiementDao.getOne(aLong);
    }

    public List<Paiement> findAll() {
        return paiementDao.findAll();
    }


    @Autowired
    private CommandeService commandeService;

    @Autowired
    private PaiementDao paiementDao;

}

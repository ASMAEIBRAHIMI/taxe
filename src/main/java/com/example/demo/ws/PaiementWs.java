package com.example.demo.ws;

import com.example.demo.bean.Paiement;
import com.example.demo.service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/paiement")
public class PaiementWs {
    @GetMapping("/code/{code}")
    public Paiement findByCode(@PathVariable("code") String code) {
        return paiementService.findByCode(code);
    }


    @DeleteMapping("/code/{code}")
    public int deleteByCode(String code) {
        return paiementService.deleteByCode(code);
    }

    @GetMapping("/id/{id}")
    public Paiement getOne(@PathVariable Long id) {
        return paiementService.getOne(id);
    }

    @GetMapping("/")
    public List<Paiement> findAll() {
        return paiementService.findAll();
    }

    @PostMapping("/commande/ref/{refCommande}")
    public int save(@RequestBody Paiement paiement,@PathVariable String refCommande) {
        return paiementService.save(paiement,refCommande);
    }


    @Autowired
    private PaiementService paiementService;
}

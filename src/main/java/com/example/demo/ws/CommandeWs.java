package com.example.demo.ws;

import com.example.demo.bean.Commande;
import com.example.demo.service.CommandeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/commande")
public class CommandeWs {
    @GetMapping("/ref/{ref}")
    public Commande findByRef(@PathVariable("ref") String ref) {
        return commandeService.findByRef(ref);
    }

    @GetMapping("/ref/{ref}/total/{total}")
    public List<Commande> findByRefAndTotal(@PathVariable String ref, @PathVariable double total) {
        return commandeService.findByRefAndTotal(ref, total);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(String ref) {
        return commandeService.deleteByRef(ref);
    }

    @GetMapping("/id/{id}")
    public Commande getOne(@PathVariable Long id) {
        return commandeService.getOne(id);
    }

    @GetMapping("/")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }

    @PutMapping("/payer/ref/{ref}/montant/{mt}")
    public int payer(@PathVariable String ref, @PathVariable double mt) {
        return commandeService.payer(ref, mt);
    }

    @Autowired
    private CommandeService commandeService;
}

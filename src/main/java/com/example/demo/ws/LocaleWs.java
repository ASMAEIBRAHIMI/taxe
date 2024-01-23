package com.example.demo.ws;

import com.example.demo.bean.Commande;
import com.example.demo.bean.taxe.Locale;
import com.example.demo.service.LocaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Locale")

public class LocaleWs {
    @Autowired
    private LocaleService localeService;

    @GetMapping("/ref/{ref}")
    public Locale findByRef(@PathVariable String ref) {
        return localeService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(String ref) {
        return localeService.deleteByRef(ref);
    }
    @PostMapping("/")
    public int save(@RequestBody Locale locale) {
        return localeService.save(locale);
    }

    @GetMapping("/")
    public List<Locale> findAll() {
        return localeService.findAll();
    }

}



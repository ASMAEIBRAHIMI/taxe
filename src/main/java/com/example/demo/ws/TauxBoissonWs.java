package com.example.demo.ws;

import com.example.demo.bean.taxe.TauxBoisson;
import com.example.demo.service.TauxBoissonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/tauxBoisson/")
public class TauxBoissonWs {
    @Autowired
    private TauxBoissonService tauxBoissonService ;

    @PostMapping("")
    public int save(@RequestBody TauxBoisson tauxBoisson) {
        return tauxBoissonService.save(tauxBoisson);
    }
     @GetMapping("code/{code}")
    public TauxBoisson findByCategorieCode(@PathVariable String code) {
        return tauxBoissonService.findByCategorieCode(code);
    }
    @GetMapping("")
    public List<TauxBoisson> findAll() {
        return tauxBoissonService.findAll();
    }
}

package com.example.demo.ws;

import com.example.demo.bean.taxe.Redevable;
import com.example.demo.service.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/Redevable")
public class RedevableWs {
@Autowired
    private RedevableService redevableService ;
@GetMapping("/cin/{cin}")
    public Redevable findByCin(@PathVariable String cin) { return redevableService.findByCin(cin);}

    @DeleteMapping("/ref/{ref}")
    public int deleteByCin(String cin) {
        return redevableService.deleteByCin(cin);



    }

}

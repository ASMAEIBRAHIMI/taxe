package com.example.demo.bean.taxe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Taxe {
    @Id
    @GeneratedValue

    private Long id;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Locale locale;

    private  double chiffreAffaire;
    @ManyToOne
    private TauxBoisson tauxBoisson;

    private double montantBase;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

}

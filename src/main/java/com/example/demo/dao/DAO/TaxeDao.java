package com.example.demo.dao.DAO;

import com.example.demo.bean.taxe.TauxBoisson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeDao  extends JpaRepository<TauxBoisson, Long> {
}

package com.example.demo.dao.taxedao;

import com.example.demo.bean.taxe.TauxBoisson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxBoissonDao extends JpaRepository<TauxBoisson, Long> {
}

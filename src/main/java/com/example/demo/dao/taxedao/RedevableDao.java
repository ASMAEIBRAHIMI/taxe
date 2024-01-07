package com.example.demo.dao.taxedao;

import com.example.demo.bean.taxe.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedevableDao extends JpaRepository<Redevable,Long> {

    Redevable findByCin(String cin);
    Redevable deleteByCin(String cin);

    }
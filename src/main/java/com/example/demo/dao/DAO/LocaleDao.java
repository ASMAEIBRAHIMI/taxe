package com.example.demo.dao.DAO;

import com.example.demo.bean.taxe.Locale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocaleDao extends JpaRepository <Locale,Long> {

    Locale findByRef(String ref);

    int deleteByRef(String ref);

}
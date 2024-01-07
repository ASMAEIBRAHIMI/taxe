package com.example.demo.dao.taxedao;

import com.example.demo.bean.taxe.Locale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocaleDao extends JpaRepository <Locale,Long> {

    Locale findByRef(String ref);

    Locale deleteByRef(String ref);

}
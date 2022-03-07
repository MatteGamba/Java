package com.gamba.concessionariaauto.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamba.concessionariaauto.entities.Auto;

public interface AutoDAO extends JpaRepository<Auto, Integer> {

}

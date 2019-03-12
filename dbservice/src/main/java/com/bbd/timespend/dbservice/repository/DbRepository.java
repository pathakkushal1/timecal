package com.bbd.timespend.dbservice.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DbRepository extends JpaRepository<com.bbd.timespend.dbservice.modle.Emp, Serializable>{

	List<com.bbd.timespend.dbservice.modle.Emp> findByUsername(String username);
}

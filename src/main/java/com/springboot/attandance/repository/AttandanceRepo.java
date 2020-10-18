package com.springboot.attandance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.attandance.model.Attandance;


@Repository
public interface AttandanceRepo extends JpaRepository<Attandance, Long> {

}

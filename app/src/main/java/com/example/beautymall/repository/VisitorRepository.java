package com.example.beautymall.repository;

import com.example.beautymall.model.Visitor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Long> {

  @Query("select v from Visitor v where ip =:ip")
  Visitor findByIp(String ip);

}

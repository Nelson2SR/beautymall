package com.example.beautymall.repository;

import com.example.beautymall.model.Promotion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionDao extends JpaRepository<Promotion, Long> {
}

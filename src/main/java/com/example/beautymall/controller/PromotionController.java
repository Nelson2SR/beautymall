package com.example.beautymall.controller;

import com.example.beautymall.repository.PromotionDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PromotionController {

  @Autowired
  private PromotionDao promotionDao;

  /**
   * Home
   */
  @GetMapping("/home")
  public String home() {
    return "Hello World";
  }

}

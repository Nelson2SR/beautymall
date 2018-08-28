package com.example.beautymall.controller;

import com.example.beautymall.repository.PromotionDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class PromotionController {

//  @Autowired
//  private PromotionDao promotionDao;

  /**
   * Home
   */
  @GetMapping("/hi")
  public String home() {
    return "Hello World";
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

}

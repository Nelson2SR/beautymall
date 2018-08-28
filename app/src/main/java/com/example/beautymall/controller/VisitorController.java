package com.example.beautymall.controller;

import com.example.beautymall.model.Visitor;
import com.example.beautymall.repository.VisitorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("")
public class VisitorController {

  @Autowired
  private VisitorRepository visitorRepository;

//  @GetMapping("/")
//  public String index(HttpServletRequest request) {
//    String ip = request.getRemoteAddr();
//    Visitor visitor = visitorRepository.findByIp(ip);
//    if (visitor == null) {
//      visitor = new Visitor();
//      visitor.setIp(ip);
//      visitor.setTime(1);
//    }else {
//      visitor.setTime(visitor.getTime() + 1);
//    }
//    visitorRepository.save(visitor);
//    return "I have seen ip " + visitor.getIp() + " " + visitor.getTime() + " times.";
//  }

}

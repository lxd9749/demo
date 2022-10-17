package com.demo.controller;

import com.demo.entity.Product;
import com.demo.server.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("client1")
public class ClientController {

    @Autowired
    BankService bankService;

    @GetMapping("hello")
    public String hello(){
        return bankService.hello();
    }

    @GetMapping("products")
    public List<Product> products(){
        return bankService.products();
    }
}

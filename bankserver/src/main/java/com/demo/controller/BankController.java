package com.demo.controller;

import com.demo.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("bank")
public class BankController {

    @GetMapping("hello")
    public String hello(){
        return "hello,银行提供的服务";
    }

    @GetMapping("products")
    public List<Product> products(){
        Product lxd = Product.builder().name("卢兴东").code("1001").summary("帅哥").description("程序员").build();
        Product wzj = Product.builder().name("王祝君").code("1002").summary("美女").description("运动员").build();
        ArrayList<Product> products = new ArrayList<>();
        products.add(lxd);
        products.add(wzj);
        return products;
    }
}

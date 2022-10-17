package com.demo.server;

import com.demo.entity.Product;
import com.demo.server.impl.BankServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "bank-server/bank",fallback = BankServiceImpl.class)
@Component
public interface BankService {
    @GetMapping("hello")
    public String hello();

    @GetMapping("products")
    public List<Product> products();
}

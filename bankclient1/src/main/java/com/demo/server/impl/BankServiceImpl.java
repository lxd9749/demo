package com.demo.server.impl;

import com.demo.entity.Product;
import com.demo.server.BankService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankServiceImpl implements BankService {
    @Override
    public String hello() {
        return "银行的兜底策略";
    }

    @Override
    public List<Product> products() {
        return null;
    }
}

package com.demo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private String code;
    private String name;
    private String summary;
    private String description;
}

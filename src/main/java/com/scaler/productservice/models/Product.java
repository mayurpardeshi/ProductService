package com.scaler.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@MappedSuperclass
public class Product extends BaseModel {
    private String title;
    private String description;
    private double price;
    private String image;
    private Category category;

}

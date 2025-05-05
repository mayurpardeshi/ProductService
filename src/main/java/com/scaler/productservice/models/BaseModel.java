package com.scaler.productservice.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
//@MappedSuperclass
public class BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String createdAt;
    private String updatedAt;
}

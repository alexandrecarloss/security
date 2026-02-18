package com.auth.security.domain.product;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "product")
@Entity(name = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price;

    public Product() {
    }

    public Product(String id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(ProductRequestDTO data){
        this.price = data.price();
        this.name = data.name();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

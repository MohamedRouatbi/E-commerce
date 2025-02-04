package com.projects.ecommerceapp.entity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name="product")
@Data

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private double price;

    @ManyToOne
    @JoinColumn(name="category_id" , nullable = false)
    private ProductCategory category;

    @Column(name="description")
    private String description;

    @Column(name="sku")
    private String sku;

    @Column(name="unit_price")
    private BigDecimal unitPrice;

    @Column(name="imageUrl")
    private String imageUrl;

    @Column(name="active")
    private boolean active;

    @Column(name="units_in_stock")
    private int unitsInStock;

    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name="last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

}

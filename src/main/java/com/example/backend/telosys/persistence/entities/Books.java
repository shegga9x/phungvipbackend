/*
 * Created on 2025-02-08 ( 14:50:02 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.example.backend.telosys.persistence.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.backend.util.Client;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * JPA entity class for "Books"
 *
 * @author Telosys
 *
 */
@Entity
@Client
@Table(name = "books", catalog = "starter-kit-db")
public class Books implements Serializable {

    private static final long serialVersionUID = 1L;

    // --- PRIMARY KEY
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // --- OTHER DATA FIELDS
    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "type", nullable = false, length = 28)
    private String type;

    @Column(name = "published_at", nullable = false)
    private LocalDateTime publishedAt;

    @Column(name = "stock", nullable = false)
    private int stock;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    /**
     * Constructor
     */
    public Books() {
        super();
    }

    public Books(Long id, String title, String type, LocalDateTime publishedAt, int stock, BigDecimal price) {
        super();
        this.id = id;
        this.title = title;
        this.type = type;
        this.publishedAt = publishedAt;
        this.stock = stock;
        this.price = price;
    };

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public LocalDateTime getPublishedAt() {
        return this.publishedAt;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return this.stock;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        String separator = "|";
        StringBuilder sb = new StringBuilder();
        sb.append("Books[");
        sb.append("id=").append(id);
        sb.append(separator).append("title=").append(title);
        sb.append(separator).append("type=").append(type);
        sb.append(separator).append("publishedAt=").append(publishedAt);
        sb.append(separator).append("stock=").append(stock);
        sb.append(separator).append("price=").append(price);
        sb.append("]");
        return sb.toString();
    }

}

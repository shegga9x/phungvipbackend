/*
 * Created on 2025-02-08 ( 14:50:02 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.example.backend.thirtParty.telosys.persistence.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.example.backend.users.User;
import com.example.backend.util.Client;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * JPA entity class for "Orders"
 *
 * @author Telosys
 *
 */
@Entity
@Client
@Table(name = "orders", catalog = "starter-kit-db")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    // --- PRIMARY KEY
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // --- OTHER DATA FIELDS
    @Column(name = "book_id", nullable = false)
    private Long bookId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "quantity", nullable = false)
    private byte quantity;

    @Column(name = "ordered_at", nullable = false)
    private LocalDateTime orderedAt;

    // --- LINKS ( RELATIONSHIPS )
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Books books;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User users;

    /**
     * Constructor
     */
    public Orders() {
        super();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getBookId() {
        return this.bookId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setquantity(byte quantity) {
        this.quantity = quantity;
    }

    public byte getquantity() {
        return this.quantity;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public LocalDateTime getOrderedAt() {
        return this.orderedAt;
    }

    public Books getBooks() {
        return this.books;
    }

    public User getUser() {
        return this.users;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public void setUser(User users) {
        this.users = users;
    }

    @Override
    public String toString() {
        String separator = "|";
        StringBuilder sb = new StringBuilder();
        sb.append("Orders[");
        sb.append("id=").append(id);
        sb.append(separator).append("bookId=").append(bookId);
        sb.append(separator).append("userId=").append(userId);
        sb.append(separator).append("quantity=").append(quantity);
        sb.append(separator).append("orderedAt=").append(orderedAt);
        sb.append("]");
        return sb.toString();
    }

}

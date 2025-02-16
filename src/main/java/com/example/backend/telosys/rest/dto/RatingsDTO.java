/*
 * Created on 2025-02-08 ( 14:50:02 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.example.backend.telosys.rest.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO class for "Ratings"
 *
 * @author Telosys
 *
 */
public class RatingsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    // --- PRIMARY KEY
    private Long bookId;
    private Long userId;
    // --- OTHER DATA FIELDS
    private byte score;
    private LocalDateTime ratedAt;
    // --- LINKS ( RELATIONSHIPS )
    private UserDTO users;
    private BooksDTO books;

    /**
     * Constructor
     */
    public RatingsDTO() {
        super();
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

    public void setScore(byte score) {
        this.score = score;
    }

    public byte getScore() {
        return this.score;
    }

    public void setRatedAt(LocalDateTime ratedAt) {
        this.ratedAt = ratedAt;
    }

    public LocalDateTime getRatedAt() {
        return this.ratedAt;
    }

    public UserDTO getUser() {
        return this.users;
    }

    public void setUserDTO(UserDTO users) {
        this.users = users;
    }

    public BooksDTO getBooks() {
        return this.books;
    }

    @Override
    public String toString() {
        String separator = "|";
        StringBuilder sb = new StringBuilder();
        sb.append("Ratings[");
        sb.append("bookId=").append(bookId);
        sb.append(separator).append("userId=").append(userId);
        sb.append(separator).append("score=").append(score);
        sb.append(separator).append("ratedAt=").append(ratedAt);
        sb.append("]");
        return sb.toString();
    }

    public void setUser(UserDTO users) {
        this.users = users;
    }

    public void setBooks(BooksDTO books) {
        this.books = books;
    }
}

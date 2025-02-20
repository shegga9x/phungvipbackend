/*
 * Created on 2025-02-08 ( 14:50:02 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.example.backend.telosys.rest.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * DTO class for "Books"
 *
 * @author Telosys
 *
 */
public class BooksDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- PRIMARY KEY 
    private Long id ;
    //--- OTHER DATA FIELDS 
    private String title ;
    private String type ;
    private LocalDateTime publishedAt ;
    private int stock ;
    private BigDecimal price ;

    /**
     * Constructor
     */
    public BooksDTO() {
		super();
    }
    
    public void setId( Long id ) {
        this.id = id ;
    }
    public Long getId() {
        return this.id;
    }

    public void setTitle( String title ) {
        this.title = title ;
    }
    public String getTitle() {
        return this.title;
    }

    public void setType( String type ) {
        this.type = type ;
    }
    public String getType() {
        return this.type;
    }

    public void setPublishedAt( LocalDateTime publishedAt ) {
        this.publishedAt = publishedAt ;
    }
    public LocalDateTime getPublishedAt() {
        return this.publishedAt;
    }

    public void setStock( int stock ) {
        this.stock = stock ;
    }
    public int getStock() {
        return this.stock;
    }

    public void setPrice( BigDecimal price ) {
        this.price = price ;
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

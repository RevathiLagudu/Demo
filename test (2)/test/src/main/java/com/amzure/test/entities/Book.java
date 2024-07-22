package com.amzure.test.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name ="BOOK" )
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    
    private String title;
    private int price;
    @Column(name = "PUBLISH_DATE")
    private LocalDate pubDate;

    // for JPA only, no use
    public Book() {
    }

    public Book(String title, int price, LocalDate publishDate) {
        this.title = title;
        this.price = price;
        this.pubDate = publishDate;
    }

   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getPubDate() {
        return pubDate;
    }

    public void setPubDate(LocalDate publishDate) {
        this.pubDate = publishDate;
    }
}
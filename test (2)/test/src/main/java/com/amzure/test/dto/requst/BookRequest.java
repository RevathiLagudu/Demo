package com.amzure.test.dto.requst;

import java.time.LocalDate;

public class BookRequest {
    private Long id;
    private String title;
    private int price;
    private LocalDate pubDate;
    public BookRequest() {
    }

    public BookRequest(String title, int price, LocalDate publishDate) {
        this.title = title;
        this.price = price;
        this.pubDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", publishDate=" + pubDate +
                '}';
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

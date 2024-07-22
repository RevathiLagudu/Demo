package com.amzure.test.dto.requst;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BookRequest {
    private Long id;
    private String title;
    private int price;
    private LocalDate pubDate;
  
}

package kr.co.yahopet.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bid;

    private String title;
    private String author;
    private String company;
    private int price;
    private String imageUrl;

    @Column(length = 8191)
    private String summary;

}

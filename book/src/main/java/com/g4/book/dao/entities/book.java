package com.g4.book.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class book {
    @Id
    private Long id;
    private String titre;
    private String publisher;
    private String datePublication;
    private double price;
    private String resume ;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

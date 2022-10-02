package com.bcp.project.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Item {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    @OneToMany(targetEntity = Review.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<Review> reviews;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
        reviews=new ArrayList<>();
    }

}

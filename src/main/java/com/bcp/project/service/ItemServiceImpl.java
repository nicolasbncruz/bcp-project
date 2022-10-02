package com.bcp.project.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ItemServiceImpl {

    private String title;
    private String reviewName;

    private Double average;

    public ItemServiceImpl(String title, String reviewName, Double rating) {
        this.title = title;
        this.reviewName = reviewName;
        this.rating = rating;
    }

    private Double rating;






}

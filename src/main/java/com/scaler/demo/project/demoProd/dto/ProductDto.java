package com.scaler.demo.project.demoProd.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDto {
    private  int id;
            private  String name;
            private  double price;
            private  String description;
            private  String category;
        private  String image;
        private  Rating ratingList;

}

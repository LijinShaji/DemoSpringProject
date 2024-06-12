package com.scaler.demo.project.demoProd.services.impl;

import com.scaler.demo.project.demoProd.dto.ProductDto;
import com.scaler.demo.project.demoProd.services.ICartSevice;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class CartServiceImpl implements ICartSevice {
    private static final String FAKE_CART_URL = "https://fakestoreapi.com/products";
    @Override
    public List<ProductDto> getAllCarts() {
        RestTemplate restTemplate = new RestTemplate();
        List<?> productDtoList= restTemplate.getForObject(FAKE_CART_URL, List.class);
        List<ProductDto> products= (List<ProductDto>) productDtoList;

        return products;
    }
}

package com.scaler.demo.project.demoProd.controller;

import com.scaler.demo.project.demoProd.dto.ProductDto;
import com.scaler.demo.project.demoProd.services.ICartSevice;
import org.junit.platform.commons.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    ICartSevice cartService;

@GetMapping()
    public List<ProductDto> loadAllcart() {
    return cartService.getAllCarts();
}
}

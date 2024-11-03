package com.example.web_shoping.controllers;

import com.example.web_shoping.servies.BasketServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {
    private final BasketServies basketService;

    @Autowired
    public BasketController(BasketServies basketService) {
        this.basketService = basketService;
    }

    @PostMapping("/store/order/add")
    public String addItems(@RequestParam("item") List<Integer> items) {
        basketService.addItem(items);
        return "Successful addproducts id to list";
    }

    @GetMapping("/store/order/get")
    public List<List<Integer>> getItems() {
        return basketService.getItems();
    }
}

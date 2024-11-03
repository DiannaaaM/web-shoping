package com.example.web_shoping;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private List<List<Integer>> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void addItem(List<Integer> itemId) {
        this.items.add(itemId);
    }

    public List<List<Integer>> getItems() {
        return this.items;
    }
}

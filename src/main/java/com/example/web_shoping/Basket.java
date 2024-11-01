package com.example.web_shoping;

import java.util.ArrayList;
import java.util.List;

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

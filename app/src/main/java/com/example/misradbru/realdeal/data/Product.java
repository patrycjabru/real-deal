package com.example.misradbru.realdeal.data;

public final class Product {
     public String name;
     public String searchPhrase;
     public Integer minPrice;
     public Integer maxPrice;
     public String uid;

    public Product() {}

    public Product(String name, String searchPhrase, Integer minPrice, Integer maxPrice, String uid) {
        this.name = name;
        this.searchPhrase = searchPhrase;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public String getSearchPhrase() {
        return searchPhrase;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public String getUid() {
        return uid;
    }
}

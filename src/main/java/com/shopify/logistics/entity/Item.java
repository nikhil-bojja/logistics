package com.shopify.logistics.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;


public class Item {

    private int id;
    private String name;
    private String cost;
    private String description;
    private HashSet<String> locations;

    public Item() {
        System.out.println("Item si created");
    }

    public Item(int id, String name, String cost, String description) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.locations = new HashSet<>( );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashSet<String> getLocations() {
        return locations;
    }

    public void setLocations(HashSet<String> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                ", description='" + description + '\'' +
                ", locations=" + locations +
                '}';
    }
}

package com.shopify.logistics.entity;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class Store {

    String name;
    HashMap<String ,Location> location;
    HashMap<String,Item> items;

    public Store() {
        this.name = "Shopify";
        this.location = new HashMap<String,Location>();
        this.items = new HashMap<String,Item>();
        System.out.println("Store "+this.name+" is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String ,Location> getLocation() {
        return location;
    }

    public void setLocation(HashMap<String, Location> location) {
        this.location = location;
    }

    public HashMap<String, Item> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", location=" + location +
                ", items=" + items +
                '}';
    }

    public int getLocationLenght(){
        return this.location.size()+1;
    }
}

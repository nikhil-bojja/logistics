package com.shopify.logistics.service;

import com.shopify.logistics.entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

@Controller
public class StoreService {

    @Autowired
    Store store;

    public void addLocationToInventory(String name, String location, HttpSession httpSession){
        store.getItems().get(name).getLocations().add(location);
        httpSession.setAttribute("items",store.getItems());
        System.out.println(store.toString());
    }
}

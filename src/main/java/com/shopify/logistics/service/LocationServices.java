package com.shopify.logistics.service;

import com.shopify.logistics.entity.Location;
import com.shopify.logistics.entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class LocationServices {

    @Autowired
    Store store;

    public void addLocations(String name, HttpSession httpSession){
        Location location = new Location(store.getLocationLenght() ,name);
        if (! store.getLocation().containsKey(location.getName())){
            store.getLocation().put(location.getName(),location);
            System.out.println("Location "+location.getName()+" is added to the store");
            httpSession.setAttribute("locations",store.getLocation());
        }else{
            System.out.println("Duplicate location");
        }

        System.out.println(store.toString());
    }
}

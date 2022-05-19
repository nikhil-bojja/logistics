package com.shopify.logistics.service;

import com.shopify.logistics.entity.Item;
import com.shopify.logistics.entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class ItemServices {

    @Autowired
    Store store;

    public void addItem(Item item, HttpSession httpSession){

        if (! store.getItems().containsKey(item.getName())){
            store.getItems().put(item.getName(),item);
            System.out.println("Item "+item.getName()+" is added to the store");

            httpSession.setAttribute("items",store.getItems());
        }else{
            System.out.println("Duplicate Item!");
        }
    }

    public void deleteItem(String item, HttpSession httpSession){
        if (store.getItems().containsKey(item)) {
            store.getItems().remove(item);
        }
        else {
            System.out.println("invalid Item to remove");
        }
    }

    public void updateItemInStore(String key,String item,String cost,String description, HttpSession httpSession){

        if (store.getItems().containsKey(key)){
            store.getItems().remove(key);
            Item item1 = new Item(-1,item,cost,description);
            store.getItems().put(item,item1);
            System.out.println( "updated item is: "+item1.toString());
            httpSession.setAttribute("Items",store.getItems());
        }else{
            System.out.println("Invalid Item to update!");
        }
    }
    public void updateItem(String item ,HttpSession httpSession){
        if (store.getItems().containsKey(item)){
            Item item1 = store.getItems().get(item);
            System.out.println( "updated item is: "+item1.toString());
            httpSession.setAttribute("updateItem",item1);
        }else{
            System.out.println("Invalid Item to update!");
        }
    }


}

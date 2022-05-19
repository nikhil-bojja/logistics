package com.shopify.logistics.controller;

import com.shopify.logistics.entity.Item;
import com.shopify.logistics.entity.Store;
import com.shopify.logistics.service.IDGenerator;
import com.shopify.logistics.service.ItemServices;
import com.shopify.logistics.service.LocationServices;
import com.shopify.logistics.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RequestMapping("/")
@Controller
public class HomeController {

    @Autowired
    IDGenerator idGenerator;

    @Autowired
    LocationServices locationServices;

    @Autowired
    ItemServices itemServices;

    @Autowired
    StoreService storeService;

    @GetMapping()
    public String home(){
        return "index";
    }

    @GetMapping("/addItem")
    public String addItemPageController(){
        return "addItem";
    }

    @GetMapping("/updateItem/{name}")
    public String addItemPageController(@PathVariable("name") String name, HttpSession httpSession){
        System.out.println("in update for "+name);
        itemServices.updateItem(name,httpSession);
        return "updateItem";
    }

    @GetMapping("/deleteItem/{name}")
    public String deleteItemPageController(@PathVariable("name") String name, HttpSession httpSession){
        //System.out.println("in delete items "+name);
        itemServices.deleteItem(name, httpSession);
        return "viewItem";
    }

    @PostMapping("/addItem")
    public String addItemController(@RequestParam("name") String name, @RequestParam("cost") String cost
            , @RequestParam("description") String description, HttpSession httpSession){
        Item item = new Item(idGenerator.generateID(), name, cost, description );
        itemServices.addItem(item, httpSession);
        return "viewItem";
    }

    @PostMapping("/updateItem")
    public String updateItemController(@RequestParam("key") String key,@RequestParam("name") String name, @RequestParam("cost") String cost
            , @RequestParam("description") String description, HttpSession httpSession){

        itemServices.updateItemInStore(key, name,cost,description, httpSession);
        return "viewItem";
    }

    @GetMapping("/viewItem")
    public String viewPageController(){
        return "viewItem";
    }

    @GetMapping("/locationHome")
    public String LocationHomePage(){
        return "locationHome";
    }
    @PostMapping("/addLocation")
    public String addLocationController(@RequestParam("name") String name, HttpSession httpSession){
        locationServices.addLocations(name , httpSession);
        return  "locationHome";
    }

    @GetMapping("/addLocation")
    public String addLocationPageController(){
        return  "addLocation";
    }

    @GetMapping("/assign/{name}")
    public String AssignLocationHelper(@PathVariable("name") String name,HttpSession httpSession){
        httpSession.setAttribute("itemLocation",name);
        return "assignLocation";
    }

    @GetMapping("/assign/{name}/{location}")
    public String AssignLocation(@PathVariable("name") String name,@PathVariable String location, HttpSession httpSession){
        storeService.addLocationToInventory(name,location,httpSession);
        return "viewItem";
    }

}

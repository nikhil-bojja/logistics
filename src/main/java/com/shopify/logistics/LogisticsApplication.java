package com.shopify.logistics;

import com.shopify.logistics.entity.Item;
import com.shopify.logistics.entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LogisticsApplication  {

	public static void main(String[] args)  {
		SpringApplication.run(LogisticsApplication.class, args);
	}

}

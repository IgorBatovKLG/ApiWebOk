package com.example.apiwebok;

import com.example.apiwebok.models.ProductLastCountModel;
import com.example.apiwebok.models.ProductModel;
import com.example.apiwebok.repositories.ProductRestRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApiWebOkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ApiWebOkApplication.class, args);
		ProductModel productModel = new ProductModel(0, "Молоко", 100, 100, 100, "Молоко", "Молоко", "Молоко", "Молоко");
		run.getBean(ProductRestRepositoryImpl.class).save(productModel);
		ProductRestRepositoryImpl bean = run.getBean(ProductRestRepositoryImpl.class);
		bean.saveCount(new ProductLastCountModel(0,1));

	}

}

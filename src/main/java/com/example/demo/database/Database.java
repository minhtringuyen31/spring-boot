package com.example.demo.database;

import com.example.demo.models.ProductModel;
import com.example.demo.repositories.ProductRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){
            return new CommandLineRunner() {
                @Override
                public void run(String... args) throws Exception {
                    ProductModel productA = new ProductModel("ABC", 2022, 2400.0,"");
                    ProductModel productB = new ProductModel("BCD", 2022, 200.0,"");
                    System.out.println("insert database");
                    logger.info(("insert data: " + productRepository.save(productA)));
                    logger.info(("insert data: " + productRepository.save(productB)));
                }
            };
    }
}

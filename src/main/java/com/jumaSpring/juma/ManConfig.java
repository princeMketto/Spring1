package com.jumaSpring.juma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Scanner;

@Configuration
public class ManConfig {

    @Bean
    SaleService saleService() {
        return new SaleService();
    }

    @Bean
    Scanner createScanner() {
        return new Scanner(System.in);
    }

    @Bean
    MainScreen mainScreen(SaleService saleService,Scanner scanner) {
        return new MainScreen(saleService,scanner);
    }

    @Bean
    SaleRepository saleRepository() {
        return new SaleRepository();
    }
}

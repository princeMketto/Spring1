package com.jumaSpring.juma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ManConfig {
    @Bean
    SaleService saleService(){
        return new SaleService();
    }
    @Bean
    MainScreen mainScreen(SaleService saleService){
        return new MainScreen(saleService);
    }
    @Bean
    SaleRepository saleRepository(Sale sale,List<Sale> list){
        return new SaleRepository(sale,list);
    }

    @Bean
    Sale sale(){
        return new Sale();
    }
}

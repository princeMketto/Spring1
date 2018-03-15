package com.jumaSpring.juma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;


public class MainScreen extends DisplayImpl{
   // DisplayImpl display;
    SaleService saleService;

    public MainScreen(SaleService saleService) {
        this.saleService = saleService;
    }

    public void start(){
        println("Welcome to Juma POS");
        println("1. List all Sales");
        println("2. Add sale");
        println("3. Remove sale");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        menu(choice);

    }

    private void menu(int choice) {
        switch (choice){
            case 1: listSale();
            break;
            case 2: addSale();
            break;
            case 3: removeSale();
            break;
            default:System.exit(0);
            break;
        }
    }

    private void removeSale() {
        println("Please enter number of sale to Delete.");
        Scanner input = new Scanner(System.in);
        String selected = input.nextLine();
        println("YOu selected:"+selected);

    }

    private void listSale() {
   List<Sale> allsale  =   saleService.getAll();
        allsale.stream().forEach(lis ->{
            println(lis.getProductname()+" @ "+lis.getCost()+" on "+lis.getTime());
        });
    start();
    }

    private void addSale() {
        println("Enter product name");
        Scanner input = new Scanner(System.in);
        String productname = input.nextLine();
        println("Enter cost");
        BigDecimal cost = input.nextBigDecimal();
        saleService.save(productname,cost);
        start();
    }
}

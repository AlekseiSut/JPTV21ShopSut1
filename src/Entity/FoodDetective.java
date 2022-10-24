/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class FoodDetective {
    private final Scanner scanner;

    public FoodDetective() {
        this.scanner = new Scanner(System.in);
    }
      public Product createProduct(){
        Product product = new Product();
        System.out.print("Введите товар: ");
        product.setTitle(scanner.nextLine());
        System.out.print("Введите стоимость товара: ");
        product.setPrice(scanner.nextLine());
        return product;

    public void printListProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.printf(i+1+". Food{title = %s%n",product.getTitle());
            System.out.print("\tPrice = [\n");
            for (int j = 0; j < product.getPrice().length; j++) {
            }
            System.out.println("\t]");
        }
        System.out.println("   }");
    }
    }
      

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Scanner;
import Entity.Product;
import Entity.Client;
/**
 *
 * @author pupil
 */
public class FoodDetective {
    private Scanner scanner;

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
      }
    public void printListProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.printf(i+1+". Product{product = %s%n",product.getTitle());
             System.out.printf(i+2+". Price{price €= %s%n",product.getPrice());
                
            }
 
    }
}

         

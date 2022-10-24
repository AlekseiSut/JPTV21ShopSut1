/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shopsut1;

import Entity.FoodDetective;
import java.util.Arrays;
import java.util.Scanner;
import Entity.Product;
public class App {
     private FoodDetective foodDetective;
    private Product[] products;   
     public App() {
         foodDetective = new FoodDetective();
         this.products = new Product[0];
     }

    public void run() {
        boolean repeat = true;
        do{
            System.out.println("Список задач: ");
            System.out.println("0. закрыть приложение");
            System.out.println("1. Добавить продукт");
            System.out.println("2. Список продуктов");
            System.out.println("3. Добавить Клиента");
            System.out.println("4. Список Клиентов");              
            System.out.print("Выберите номер задачи");
            Scanner scanner = new Scanner(System.in);    
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("_____________");
            switch (task) {
                case 0:
                    repeat = false;
                    System.out.println("0. закрыть приложение");
                    break;
                case 1:                                                         
                    System.out.println("1. Добавить продукт");
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = foodDetective.createProduct();
                    break;
                case 2:
                    System.out.println("2. Список продуктов");
                    foodDetective.printListProducts(products);
                    break;
                case 3:
                    System.out.println("3. Добавить Клиента");
                    break;
                case 4:
                    System.out.println("4. Список Клиентов");
                    break;
                default:
                    System.out.println("Выберите задачу из списка");
            }
            System.out.println("-----------------------------");
        }while(repeat);
        System.out.println("Спасибо за покупки");
    }

        }
    

    
    

    
    


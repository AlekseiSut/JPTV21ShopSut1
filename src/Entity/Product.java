/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Product {    
private String title;
private String price;

    @Override
    public String toString() {
        return "Product{" + "title=" + title + ", price=" + price + '}';
    }





    public Product() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    }


    



    


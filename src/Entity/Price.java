/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author pupil
 */
public class Price {
    private String price;

    @Override
    public String toString() {
        return "Price{" + "price=" + price + '}';
    }
    

    public Price() {
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}

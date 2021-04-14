/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author mahajan
 */
public class CartCatalogue 
{
    private ArrayList<CartProduct> cartCat;
    
    public CartCatalogue()
    {
        this.cartCat= new ArrayList<CartProduct>();
    }

    public ArrayList<CartProduct> getCartCat() {
        return cartCat;
    }
    
    public void addCartCat(CartProduct cartCatal)
    {
        this.cartCat.add(cartCatal);
    }
    
    public void remCartCat(CartProduct cartCatal)
    {
        this.cartCat.remove(cartCatal);
    }
    
    public double getCartTotal() {
        double total = 0.0;
        for (CartProduct cp : cartCat) {
            total += cp.getPrice();
        }
        return total;
    }
}

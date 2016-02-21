package meenu.models;

import java.util.ArrayList;

/**
 *
 * @author ocmoh
 */
public class ShoppingList {

    public ArrayList<Product> productList = new ArrayList<>();

    public void addAmount(ProductType pt, float a) {
        if (a <= 0) {
            return;
        }

        Product p = getProduct(pt);    //Get product from list

        if (p == null) {        //Create product if it doesn't exist
            p = new Product(pt, a, "");
            productList.add(p);
        }

        p.getQuantity().addAmount(a);//add to product
    }

    public void removeAmount(ProductType pt, float a) {
        Product p = getProduct(pt);    //Get product from list

        if (p == null) {        //return if product doesn't exist
            return;
        }

        if (!p.quantity.removeAmount(a)) {
            productList.remove(p);     //Remove object from list if quantity is less than 0
        }
    }

    public void setAmount(ProductType pt, float a) {
        Product p = getProduct(pt);

        if (a <= 0) //Remove product if amount is 
        {
            productList.remove(p);
        }

        if (p == null) {
            p = new Product(pt, a, "");
            productList.add(p);
        }

        if (!p.quantity.setAmount(a)) {
            productList.remove((p));
        }
    }

    public Quantity getAmount(ProductType pt) {
        return getProduct(pt).quantity;
    }

    public boolean contains(ProductType pt) {
        return getProduct(pt) != null;
    }

    public Product getProduct(ProductType pt) {
        for (Product p : productList) {
            if (p.prodtype == pt) {
                return p;
            }
        }
        return null;
    }
}

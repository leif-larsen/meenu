package meenu.models;

import java.util.Date;

/**
 *
 * @author Steffen
 */
public class Product {

    public ProductType type;
    public Quantity quantity;
    public Date expirationDate;
    public String barCode;

    public Product(ProductType t, float amount, Date d) {
        type = t;
        quantity = new Quantity(type.measurementUnit, amount);
        expirationDate = d;
    }

    public Product(ProductType t, float amount) {
        type = t;
        quantity = new Quantity(type.measurementUnit, amount);
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void editProductType_barCode(Product a, String barCode) {
        a.barCode = barCode;
    }

}

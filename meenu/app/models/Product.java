package meenu.models;

import java.util.Date;

/**
 *
 * @author Steffen
 */
public class Product {

    public ProductType prodtype;
    public Quantity quantity;
    public Date expirationDate;
    public String barCode;
	public String productName;

    public Product(ProductType t, float amount, Date d) {
        prodtype = t;
        quantity = new Quantity(prodtype.measurementUnit, amount);
        expirationDate = d;
    }

    public Product(ProductType t, float amount, String name) {
        prodtype = t;
        quantity = new Quantity(prodtype.measurementUnit, amount);
		productName = name;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void editProductType_barCode(Product a, String barCode) {
        a.barCode = barCode;
    }

}

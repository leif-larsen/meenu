package meenu.models;

import java.util.ArrayList;

/**
 *
 * @author Steffen
 */
public class ProductType {

    public NutritionalInformation nutritionalInfo;

    public String productName;
    public String barCode;
    public String measurementUnit;
    public float price;
    public ArrayList<Product> list = new ArrayList<>();
    
    public ProductType(String producName, NutritionalInformation info, float price) {
		this.productName = producName;
		this.nutritionalInfo = info;
		this.price = price;
    }

    public boolean addProduct(Product product) {
        return list.add(product);
    }

    public boolean removeProduct(Product product) {
        return list.remove(product);
    }

    public Quantity getTotalAmmount() {
        Quantity quantity = new Quantity(measurementUnit, 0);
        for (Product p : list) {  //For each Product p in list
            quantity.amount += p.quantity.amount;
        }
        return quantity;
    }

    public void editNutritionalInfo(NutritionalInformation nutritionalList) {
        nutritionalInfo = nutritionalList;
    }
    public ArrayList<Product> getProductList(Product p){
        return list;
    }
    
}

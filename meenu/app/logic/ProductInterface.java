package meenu.logic;

import java.util.ArrayList;
import java.util.Date;
import meenu.models.NutritionalInformation;
import meenu.models.Product;
import meenu.models.ProductType;
import meenu.models.Quantity;

/**
 *
 * @author Steffen
 */
public class ProductInterface {

    private ArrayList<ProductType> list = new ArrayList<>();

    public boolean addProduct(ProductType type, float amount, Date expirationDate) {
        Product p = new Product(type, amount, expirationDate);
        if (!list.contains(type)) {
            list.add(type);
        }
        return type.addProduct(p);
    }

    public void removeProduct(Product p) {
        p.type.removeProduct(p);
    }

    public void removeProductAmount(Product p, float amount) {
        if (!p.getQuantity().removeAmount(amount)) {
            removeProduct(p);
        }
    }

    public void addProductAmount(Product p, float amount) {
        p.getQuantity().addAmount(amount);
    }

    public void setProductamount(Product p, float amount) {
        if (!p.getQuantity().setAmount(amount)) {
            removeProduct(p);
        }
    }

    public boolean deleteProductType(ProductType a) {
        return list.remove(a);
    }

    public void editProductType_name(ProductType a, String productName) {
        a.productName = productName;
    }

    public void editProductType_nutritionalInformation(ProductType a, NutritionalInformation info) {
        a.nutritionalInfo = info;
    }

    public void editProductType_price(ProductType a, float price) {
        a.price = price;
    }

    public void addProductType(String productName, NutritionalInformation info, float price) {
        ProductType type = new ProductType(productName, info, price);
    }

    public Quantity getProductQuantity(ProductType a) {
        return a.getTotalAmmount();
    }

    public ArrayList<Product> getListOfProducts(ProductType a) {
        return a.list;
    }

    public ArrayList<ProductType> getListOfProductType() {
        return list;
    }
}

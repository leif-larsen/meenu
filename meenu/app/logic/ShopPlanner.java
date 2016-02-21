package meenu.logic;

import java.util.ArrayList;
import java.util.Calendar;
import meenu.models.Meal;
import meenu.models.Product;
import meenu.models.ProductType;
import meenu.models.ShoppingList;

/**
 *
 * @author ocmoh
 */
public class ShopPlanner {
    ProductInterface productInterface;
    
    public int shoppingFrequency = 3;  //In days
    public int safetyMargin = 2;
    private ShoppingList shoppingList;
    private ShoppingList staticItems;
    private MealPlanner mealPlanner;
    private Calendar c = Calendar.getInstance();
    
    public ShopPlanner(ProductInterface pi, MealPlanner mp)
    {
        productInterface = pi;
        mealPlanner = mp;
    }

    public void generateList() {
        updateTime();
        c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + shoppingFrequency + safetyMargin);
        ArrayList<Meal> meals = mealPlanner.getMealsBefore(c);
        shoppingList = new ShoppingList();

        ShoppingList tmp = new ShoppingList();

        for (Meal m : meals) {
            for (Product p : m.getIngredients()) {
                tmp.addAmount(p.type, p.getQuantity().getAmount());
            }
        }

        for (Product p : staticItems.productList) {
            tmp.addAmount(p.type, p.getQuantity().getAmount());
        }

        for (ProductType pt : productInterface.getListOfProductType()) {
            tmp.removeAmount(pt, pt.getTotalAmmount().getAmount());
        }
    }

    void add(ProductType pt, float amount) {
        shoppingList.addAmount(pt, amount);
    }

    void remove(ProductType pt, float amount) {
        shoppingList.removeAmount(pt, amount);
    }

    void setStatic(ProductType pt, float amount) {
        staticItems.setAmount(pt, amount);
    }

    ArrayList<Product> getShoppingList() {
        return shoppingList.productList;
    }

    void updateTime() {
        c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
    }
}

package meenu.logic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import meenu.models.Meal;
import meenu.models.Product;
import meenu.models.Recipe;

public class MealPlanner {

    private ProductInterface pi;

    private ArrayList<Meal> mealList = new ArrayList<>();
    
    public void addMeal(Recipe r, int year, int month, int day)
    {
        mealList.add(new Meal(r, year, month, day));
        Collections.sort(mealList);
    }

    public ArrayList<Meal> getMealsBefore(Calendar time) {
        ArrayList<Meal> tmp = new ArrayList<>();
        for (Meal m : mealList) {
            if (m.calendar.before(time)) {
                tmp.add(m);
            }
        }
        return tmp;
    }

    public ArrayList<Product> missingIngredients(Recipe r) {
        ArrayList<Product> tmp = new ArrayList<>();
        for (Product p : r.productList) {

            float available = pi.getProductQuantity(p.prodtype).getAmount();
            float required = p.getQuantity().getAmount();

            if (required > available) {
                tmp.add(new Product(p.prodtype, required - available, "Tine Styrk"));
            }
        }

        return tmp;
    }

    boolean haveIngredients(Recipe r) {
        for (Product p : r.productList) {
            float available = pi.getProductQuantity(p.prodtype).getAmount();
            float required = p.getQuantity().getAmount();

            if (required > available) {
                return false;
            }
        }
        return true;
    }
}

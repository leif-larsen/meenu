package meenu.models;

import java.util.ArrayList;
import java.util.Calendar;

public class Meal implements Comparable<Meal> {

    public Recipe recipe;
    public Calendar calendar;

    public Meal(Recipe r, int year, int month, int day) {
        setTime(year, month, day);
        recipe = r;
    }

    public void setRecipe(Recipe r) {
        recipe = r;
    }

    public void setTime(int year, int month, int day) {
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, year);
        calendar.set(Calendar.DAY_OF_MONTH, year);
    }

    public ArrayList<Product> getIngredients() {
        return recipe.productList;
    }
    
    @Override
    public int compareTo(Meal t) {
        return calendar.compareTo(t.calendar);
    }
}

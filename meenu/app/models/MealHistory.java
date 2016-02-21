
package meenu.models;

import java.util.ArrayList;


public class MealHistory {
    public ArrayList<Meal> historyOfMeals = new ArrayList<>();
    
    public boolean addMeal(Meal meal){
        
        return historyOfMeals.add(meal);
    }
    
    public boolean removeMeal(Meal meal){
        return historyOfMeals.remove(meal);
    }
}

package meenu.models;

import java.util.ArrayList;

public class UserProfile {
    public String name;
    public MealHistory history;
    public ArrayList<ProductType> exclusions = new ArrayList<>();
    public ArrayList<Recipe> favorites = new ArrayList<>();
    
    
    
    UserProfile(String name){
        this.name = name;
    }
    
    public boolean addExclusion(ProductType product){
        return exclusions.add(product);
    }
    
    public boolean removeExclusion(ProductType product){
        return exclusions.remove(product);
    }
    
    public boolean addFavorite(Recipe recipe){
        return favorites.add(recipe);
    }
    
    public boolean removeFavorite(Recipe recipe){
        return favorites.remove(recipe);
    }
    
    public MealHistory getHistory(){
        return history;
    }
}

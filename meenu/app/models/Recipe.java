package meenu.models;
import java.sql.Time;
import java.util.ArrayList;
public class Recipe {
    public ArrayList<Product> productList = new ArrayList<>();
    public ArrayList<String> instructions = new ArrayList<>();
    public Time cookingTime;
    public int numberOfServings;
}
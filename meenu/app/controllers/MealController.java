package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class MealController extends Controller {

    public Result index(Long mealId) {
        return ok(meal.render("This is pizza " + mealId));
    }

}

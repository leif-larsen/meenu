package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class MealPlannerController extends Controller {

    public Result index() {
        return ok(mealplanner.render("This is the page for meal plans... :D:D"));
    }

}

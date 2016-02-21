package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class RecipeManagerController extends Controller {

    public Result index() {
        return ok(recipemanager.render());
    }
	
	public Result addRecipe() {
		return ok(recipeadd.render());
	}
	
	public Result editRecipe(Long recipeId) {
		return ok(recipeedit.render(Long.toString(recipeId)));
	}

}

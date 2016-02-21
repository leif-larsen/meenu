package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class RecipeManagerController extends Controller {

    public Result index() {
        return ok(index.render("This is the page for recipe planning... :D:D"));
    }

}

package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class ProductManagerController extends Controller {

    public Result index() {
        return ok(index.render("This is the page for managing products... :D:D"));
    }

}

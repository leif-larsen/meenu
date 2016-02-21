package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class PeopleController extends Controller {

    public Result index() {
        return ok(people.render("This is the page for controlling people... So they can do evil shit... MOHAHAHAHA"));
    }

}

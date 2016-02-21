package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Welcome to meenu"));
    }
	
	public Result settings() {
		return ok(settings.render("- Where all the fun can be changed"));
	}
	
	public Result concept() {
		return ok(concept.render());
	}

}

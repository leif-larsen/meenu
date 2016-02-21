package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class ProductManagerController extends Controller {

    public Result index() {
        return ok(productmanager.render("This is the page for managing products... :D:D"));
    }
	
	public Result editProductType(Long typeId) {
		return ok(producttypeedit.render(Long.toString(typeId)));
	}
	
	public Result addProductType() {
		return ok(addproducttype.render());
	}
	
	public Result editProduct(Long productId) {
		return ok(productedit.render(Long.toString(productId)));
	}
}

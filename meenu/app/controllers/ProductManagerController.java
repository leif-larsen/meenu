package controllers;

import play.*;
import play.mvc.*;

import meenu.logic.*;
import meenu.models.*;
import java.util.ArrayList;
import views.html.*;

public class ProductManagerController extends Controller {

	private ProductInterface productInterface = new ProductInterface();
	
    public Result index() {
		ArrayList<ProductType> productTypes = productInterface.getListOfProductType();
		ArrayList<Product> products = new ArrayList<Product>();
		
		for(int i = 0; i < productTypes.size(); i++) {
			for(int j = 0; j < productInterface.getListOfProducts(productTypes.get(i)).size(); j++) {
				products.add(productInterface.getListOfProducts(productTypes.get(i)).get(j));				
			}
		}
		
        return ok(productmanager.render(productTypes, products));
    }
	
	public Result editProductType(String typeId) {
		return ok(producttypeedit.render(typeId));
	}
	
	public Result addProductType() {
		return ok(addproducttype.render());
	}
	
	public Result editProduct(Long productId) {
		return ok(productedit.render(Long.toString(productId)));
	}
}

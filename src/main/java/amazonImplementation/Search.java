package amazonImplementation;

public class Search {

	public String displayProductName(Product product) { // here we will take the product name returned from
		// product.java class
		if (product.getProductList().contains(product.getProductName())) {
			return product.getProductName();
		} else {
			return null;
		}
		// or we can simply write, because if above return is satisfied that will be the
		// thing which will be returned to method
		// return null;
	}

}

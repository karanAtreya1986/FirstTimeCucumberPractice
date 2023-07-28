package amazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productName;
	private int price;

	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// this method will list of products in the form of string
	public List<String> getProductList() {
		List<String> prodList = new ArrayList<>();
		prodList.add("apple");
		prodList.add("hp");
		prodList.add("samsung");
		prodList.add("bourbon");
		prodList.add("iphone");
		return prodList;
	}

}

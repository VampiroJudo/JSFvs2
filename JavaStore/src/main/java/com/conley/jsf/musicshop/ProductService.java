package com.conley.jsf.musicshop;

import java.util.List;

public interface ProductService {
	
	List<Product> getPopularProducts();
	
	Product getProduct(long id);

}

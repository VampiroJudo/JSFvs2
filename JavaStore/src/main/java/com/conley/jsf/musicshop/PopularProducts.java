package com.conley.jsf.musicshop;

import javax.annotation.PostConstruct;

@Named
@RequestScoped
public class PopularProducts {
	
	@Inject
	private ProductService productService;
	
	private List<Product> products;
	
	@PostConstruct


}

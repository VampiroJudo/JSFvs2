package com.conley.jsf.musicshop;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class ProductServiceImpl implements ProductService {

    private final Map<Long, Product> products;

    private final List<Product> popularProducts;

    public ProductServiceImpl() {
        Map<Long, Product> map = new HashMap<>();
        map.put(1L, new Product(1L, "Microphone", "The M-16 Microphone is the ultimate in sound quality and ease of use.", new BigDecimal("95.00"), "Microphone" ));
        map.put(2L, new Product(2L, "Guitar", "This guitar has amazing tone and looks to boot!", new BigDecimal("1000.00"), "Guitar"));
        map.put(3L, new Product(3L, "Saxophone", "You can wail like 'Bird' Parker on this sax. Perfect for the up and coming Jazz Man.",new BigDecimal("1500.00"), "Saxophone"));
        map.put(4L, new Product(4L, "Bass Guitar", "This is the perfect bass to put them fat fingered meat butcher hands to work, makes some solid thick tones to set the groove", new BigDecimal("700.00"), "Bass Guitar"));
        map.put(5L, new Product(5L,"Drum Kit","This is the kit all metalheads and jazz bangers dream of!", new BigDecimal("800.00"), "Drum Kit"));


       
        products = Collections.unmodifiableMap(map);
        popularProducts = Collections.unmodifiableList(new ArrayList<>(products.values()));
    }

    @Override
    public List<Product> getPopularProducts() {
        return popularProducts;
    }

    @Override
    public Product getProduct(long id) {
        return products.get(id);
    }
}

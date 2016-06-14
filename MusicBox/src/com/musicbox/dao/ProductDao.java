package com.musicbox.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.musicbox.model.Product;

public class ProductDao {

	private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("Guitar1");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is a fender strat guitar!");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Fender");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Record1");
        product2.setProductCategory("Record");
        product2.setProductDescription("This is an awesome mix of 20th century!");
        product2.setProductPrice(25);
        product2.setProductCondition("new");
        product2.setProductStatus("Active");
        product2.setUnitInStock(51);
        product2.setProductManufacturer("EMI");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Speaker1");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("This is a Polk Shelf Speaker!");
        product3.setProductPrice(355);
        product3.setProductCondition("new");
        product3.setProductStatus("Active");
        product3.setUnitInStock(9);
        product3.setProductManufacturer("Polk");
        
        Product product4 = new Product();
        product4.setProductId("4");
        product4.setProductName("Speaker1");
        product4.setProductCategory("Accessory");
        product4.setProductDescription("This is a Polk Shelf Speaker!");
        product4.setProductPrice(355);
        product4.setProductCondition("new");
        product4.setProductStatus("Active");
        product4.setUnitInStock(9);
        product4.setProductManufacturer("Polk");
        
        Product product5 = new Product();
        product5.setProductId("5");
        product5.setProductName("Speaker1");
        product5.setProductCategory("Accessory");
        product5.setProductDescription("This is a Polk Shelf Speaker!");
        product5.setProductPrice(355);
        product5.setProductCondition("new");
        product5.setProductStatus("Active");
        product5.setUnitInStock(9);
        product5.setProductManufacturer("Polk");
        
        Product product7 = new Product();
        product7.setProductId("7");
        product7.setProductName("Speaker1");
        product7.setProductCategory("Accessory");
        product7.setProductDescription("This is a Polk Shelf Speaker!");
        product7.setProductPrice(355);
        product7.setProductCondition("new");
        product7.setProductStatus("Active");
        product7.setUnitInStock(9);
        product7.setProductManufacturer("Polk");
        
        Product product8 = new Product();
        product8.setProductId("8");
        product8.setProductName("Speaker1");
        product8.setProductCategory("Accessory");
        product8.setProductDescription("This is a Polk Shelf Speaker!");
        product8.setProductPrice(355);
        product8.setProductCondition("new");
        product8.setProductStatus("Active");
        product8.setUnitInStock(9);
        product8.setProductManufacturer("Polk");
        
        
        Product product9 = new Product();
        product9.setProductId("9");
        product9.setProductName("Speaker1");
        product9.setProductCategory("Accessory");
        product9.setProductDescription("This is a Polk Shelf Speaker!");
        product9.setProductPrice(355);
        product9.setProductCondition("new");
        product9.setProductStatus("Active");
        product9.setUnitInStock(9);
        product9.setProductManufacturer("Polk");
        
        Product product10 = new Product();
        product10.setProductId("10");
        product10.setProductName("Speaker1");
        product10.setProductCategory("Accessory");
        product10.setProductDescription("This is a Polk Shelf Speaker!");
        product10.setProductPrice(355);
        product10.setProductCondition("new");
        product10.setProductStatus("Active");
        product10.setUnitInStock(9);
        product10.setProductManufacturer("Polk");
        
        Product product6 = new Product();
        product6.setProductId("6");
        product6.setProductName("Speaker1");
        product6.setProductCategory("Accessory");
        product6.setProductDescription("This is a Polk Shelf Speaker!");
        product6.setProductPrice(355);
        product6.setProductCondition("new");
        product6.setProductStatus("Active");
        product6.setUnitInStock(9);
        product6.setProductManufacturer("Polk");
        
        Product product11 = new Product();
        product11.setProductId("11");
        product11.setProductName("Speaker1");
        product11.setProductCategory("Accessory");
        product11.setProductDescription("This is a Polk Shelf Speaker!");
        product11.setProductPrice(355);
        product11.setProductCondition("new");
        product11.setProductStatus("Active");
        product11.setUnitInStock(9);
        product11.setProductManufacturer("Polk");
        
        productList=new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product7);
        productList.add(product6);
        productList.add(product9);
        productList.add(product10);
        productList.add(product11);

        return productList;
    }

    public Product getProductById(String productId) throws IOException{
        for (Product product: getProductList()) {
            if(product.getProductId().equals(productId)) {
                return product;
            }
        }

        throw new IOException("No product found.");
    }
	

}
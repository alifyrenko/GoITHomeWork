package com.goit.gojavaonline.offline4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ANTON on 17.06.2016.
 */
public class DataBase {


    Map<ProductName, String> productId = new HashMap<>();

    public String getProductId(ProductName productName) {

        productId.put(ProductName.DRUMS, "0001");
        productId.put(ProductName.GUITAR, "0002");
        productId.put(ProductName.PIANO, "0003");
        productId.put(ProductName.TRUMPET, "0004");

        return productId.get(productName);
    }

    Map<ProductName, Integer> productsOnStock = new HashMap<>();

    public void addProductToStock(ProductName productName, int qty) {
        if (qty <= 0) {
            throw new ArithmeticException("qty should be >= 0! ");
        }

        if (productsOnStock.get(productName) == null) {
            productsOnStock.put(productName, qty);
        } else {
            productsOnStock.put(productName, productsOnStock.get(productName) + qty);
        }
    }

    public void deleteProductFromStock(ProductName productName, int qty) {
        if (productsOnStock.get(productName) == null || productsOnStock.get(productName) < qty) {
            System.out.println("You have not enough " + productName + " on your Stock!");
        } else {
            productsOnStock.put(productName, productsOnStock.get(productName) - qty);
        }
    }

    public void showBalanceOnStock() {
        System.out.printf("%-6s%-8s%-4s", "ID", "Name", "Q-ty");
        System.out.println();
        System.out.println("------------------");

        for (Map.Entry<ProductName, Integer> pair : productsOnStock.entrySet()) {
            System.out.printf("%-6s%-8s%-4d", getProductId(pair.getKey()), pair.getKey(), pair.getValue());
            System.out.println();
        }
    }

    public void isProductOnStock(ProductName productName) {
        System.out.println();
        System.out.println("You have " + productsOnStock.get(productName) + " " + productName + " on your Stock");
    }

}

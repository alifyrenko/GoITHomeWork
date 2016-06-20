package com.goit.gojavaonline.offline4;

import java.util.Map;

/**
 * Created by ANTON on 17.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

       DataBase dataBase = new DataBase();

        dataBase.addProductToStock(ProductName.GUITAR, 18);
        dataBase.addProductToStock(ProductName.TRUMPET, 15);
        dataBase.addProductToStock(ProductName.DRUMS, 15);
        dataBase.addProductToStock(ProductName.PIANO, 15);
        dataBase.addProductToStock(ProductName.TRUMPET, 5);

        dataBase.deleteProductFromStock(ProductName.PIANO, 15);

        dataBase.showBalanceOnStock();

        dataBase.isProductOnStock(ProductName.TRUMPET);
    }
}

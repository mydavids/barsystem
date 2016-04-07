package mydavids.factories.Impl;

import mydavids.domain.Stock;
import mydavids.factories.StockFactory;

import java.util.UUID;

/**
 * Created by Yusiry Davids on 4/7/2016.
 */
public class StockFactoryImpl implements StockFactory {

    private static StockFactoryImpl factory = null;

    private StockFactoryImpl(){

    }

    public static StockFactoryImpl getInstance(){
        if(factory == null)
            factory = new StockFactoryImpl();
        return factory;
    }

    @Override
    public Stock createStock(String stockID, String name, double price, int amountInStock, String description) {
        Stock stock = new Stock.Builder()
                .id(UUID.randomUUID().toString())
                .stockID(stockID)
                .name(name)
                .price(price)
                .amountInStock(amountInStock)
                .description(description)
                .build();
        return stock;
    }
}

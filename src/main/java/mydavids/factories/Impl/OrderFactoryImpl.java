package mydavids.factories.Impl;

import mydavids.domain.Order;
import mydavids.factories.OrderFactory;

import java.util.UUID;

/**
 * Created by Yusiry Davids on 4/7/2016.
 */
public class OrderFactoryImpl implements OrderFactory {

    private static OrderFactoryImpl factory = null;

    private OrderFactoryImpl(){

    }

    public static OrderFactoryImpl getInstance(){
        if(factory == null)
            factory = new OrderFactoryImpl();
        return factory;
    }

    @Override
    public Order createOrder(String date, double amount) {
        Order order = new Order.Builder()
                .id(UUID.randomUUID().toString())
                .date(date)
                .amount(amount)
                .build();
        return order;
    }
}

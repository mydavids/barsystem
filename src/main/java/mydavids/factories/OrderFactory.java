package mydavids.factories;

import mydavids.domain.Order;

import java.util.Date;

/**
 * Created by Yusiry Davids on 4/7/2016.
 */
public interface OrderFactory {
    public Order createOrder(String date, double amount);
}

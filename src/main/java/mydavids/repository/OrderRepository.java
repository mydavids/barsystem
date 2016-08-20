package mydavids.repository;


import mydavids.domain.Order;
import mydavids.domain.Stock;

import java.util.ArrayList;

/**
 * Created by Yusiry Davids on 4/24/2016.
 */
public interface OrderRepository {
    void create(Order order);
    Order findById(String id);
    void update(Order order);
    void delete(Order order);
    ArrayList<Stock> findItems(Order order);
    ArrayList<Order> findAll();
}

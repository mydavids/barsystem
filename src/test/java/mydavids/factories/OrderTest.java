package mydavids.factories;

import junit.framework.Assert;
import mydavids.domain.Order;
import mydavids.factories.Impl.OrderFactoryImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yusiry Davids on 4/7/2016.
 */
public class OrderTest {

    private OrderFactory factory;

    @Before
    public void setUp(){
        factory = OrderFactoryImpl.getInstance();
    }

    @Test
    public void testOrderCreation(){
        Order order = factory.createOrder("15/08/2015", 500.00);
        Assert.assertEquals(order.getDate(), "15/08/2015");
        Assert.assertEquals(order.getAmount(), 500.00);
        Assert.assertNotNull(order.getId());
    }

    @Test
    public void testOrderUpdate(){
        Order order = factory.createOrder("15/08/2015", 500.00);
        Assert.assertEquals(order.getDate(), "15/08/2015");
        Assert.assertEquals(order.getAmount(), 500.00);
        Assert.assertNotNull(order.getId());

        Order updateOrder = new Order.Builder().copy(order).amount(600.00).build();
        Assert.assertEquals(updateOrder.getAmount(), 600.00);
        Assert.assertEquals(order.getDate(), updateOrder.getDate());
        Assert.assertEquals(order.getId(), updateOrder.getId());

    }

}

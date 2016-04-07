package mydavids.factories;

import junit.framework.Assert;
import mydavids.domain.Waiter;
import mydavids.factories.Impl.WaiterFactoryImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yusiry Davids on 4/7/2016.
 */
public class WaiterTest {

    private WaiterFactory factory;

    @Before
    public void setUp() throws Exception{
        factory = WaiterFactoryImpl.getInstance();
    }

    @Test
    public void testWaiterCreation(){
        Waiter waiter = factory.createWaiter("Amy", "Susan", "9502115678999");
        Assert.assertEquals(waiter.getName(), "Amy");
        Assert.assertEquals(waiter.getSurname(), "Susan");
        Assert.assertEquals(waiter.getIdNumber(),"9502115678999");
        Assert.assertNotNull(waiter.getId());
    }

    @Test
    public void testWaiterUpdate(){
        Waiter waiter = factory.createWaiter("Amy", "Susan", "9502115678999");
        Assert.assertEquals(waiter.getName(), "Amy");
        Assert.assertEquals(waiter.getSurname(), "Susan");
        Assert.assertEquals(waiter.getIdNumber(),"9502115678999");
        Assert.assertNotNull(waiter.getId());

        Waiter updateWaiter = new Waiter.Builder().copy(waiter).name("Carmen").build();
        Assert.assertEquals(updateWaiter.getName(), "Carmen");
        Assert.assertEquals(waiter.getSurname(), updateWaiter.getSurname());
        Assert.assertEquals(waiter.getIdNumber(),updateWaiter.getIdNumber());
        Assert.assertEquals(waiter.getId(), updateWaiter.getId());

    }
}

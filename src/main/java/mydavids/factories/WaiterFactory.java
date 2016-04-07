package mydavids.factories;

import mydavids.domain.Waiter;

/**
 * Created by Yusiry Davids on 4/7/2016.
 */
public interface WaiterFactory {
    Waiter createWaiter(String name, String surname, String idNumber);
}

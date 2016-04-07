package mydavids.factories;

import mydavids.domain.Manager;

/**
 * Created by Yusiry Davids on 4/7/2016.
 */
public interface ManagerFactory {
    Manager createManager(String name, String surname, String idNumber);
}

package mydavids.service;

import java.util.Set;

/**
 * Created by Yusiry on 8/13/2016.
 */
public interface Services<E, ID> {
    E Create(E entity);

    E readById(ID id);

    Set<E> readAll();

    E Update(E entity);

    void Delete(E entity);

}

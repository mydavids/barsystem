package mydavids.repository;


import mydavids.domain.Table;

/**
 * Created by Yusiry Davids on 4/24/2016.
 */
public interface TableRepository {
    void create(Table table);
    Table findById(String id);
    void update(Table table);
    void delete(Table table);
}

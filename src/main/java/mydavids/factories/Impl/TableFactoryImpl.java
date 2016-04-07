package mydavids.factories.Impl;

import mydavids.domain.Table;
import mydavids.factories.TableFactory;

import java.util.UUID;

/**
 * Created by Yusiry Davids on 4/7/2016.
 */
public class TableFactoryImpl implements TableFactory {

    private static TableFactoryImpl factory = null;

    private TableFactoryImpl(){

    }

    public static TableFactoryImpl getInstance(){
        if(factory == null)
            factory = new TableFactoryImpl();
        return factory;
    }

    @Override
    public Table createTable(int tableNumber, int seating, String location) {
        Table table = new Table.Builder()
                .id(UUID.randomUUID().toString())
                .tableNumber(tableNumber)
                .seating(seating)
                .location(location)
                .build();
        return table;
    }
}

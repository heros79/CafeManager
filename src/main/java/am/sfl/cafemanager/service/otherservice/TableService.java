package am.sfl.cafemanager.service.otherservice;

import am.sfl.cafemanager.model.Table;

/**
 * Created by user on 8/7/2017.
 */
public interface TableService {

    void cresteTable (Table table);

    Table findByTableNumber (int tableNumber);

    Table findByTableStatus (boolean assigned);
}

package am.sfl.cafemanager.service.otherservice;

import am.sfl.cafemanager.model.TableC;

import java.util.List;

/**
 * Created by user on 8/7/2017.
 */
public interface TableService {

    void cresteTable (TableC table);

    TableC findByTableNumber (int tableNumber);

    List <TableC> findAll ();

    TableC findByTableStatus (boolean assigned);
}

package am.sfl.cafemanager.dao;

import am.sfl.cafemanager.model.TableC;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by user on 8/7/2017.
 */
public interface TableDao extends JpaRepository <TableC, Long> {
    
    TableC findByTableNumber (int TableNumber);

    TableC findByTableStatus (boolean assigned);
}

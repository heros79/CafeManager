package am.sfl.cafemanager.dao;

import am.sfl.cafemanager.model.Table;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by user on 8/7/2017.
 */
public interface TableDao extends JpaRepository <Table, Long> {
    
    Table findByTableNumber (int TableNumber);

    Table findByTableStatus (boolean assigned);
}

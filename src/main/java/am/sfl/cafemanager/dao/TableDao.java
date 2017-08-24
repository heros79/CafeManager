package am.sfl.cafemanager.dao;

import am.sfl.cafemanager.model.TableC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by user on 8/7/2017.
 */
public interface TableDao extends JpaRepository <TableC, Long> {
    
    TableC findByTableNumber (int TableNumber);

    TableC findByTableStatus (boolean assigned);

    List<TableC> findAll ();

    @Query(value = "SELECT table_id FROM tables WHERE tables.user_id = ?1", nativeQuery = true)
    List<Long> tablesListByWaiter (@Param("user_id") long id);

}

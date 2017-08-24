package am.sfl.cafemanager.model;

import javax.persistence.*;
import java.util.Set;


/**
 * Simple JavaBean Object that represents Table status.
 *
 * Created by David Karchikyan on 8/7/2017.
 */

@Entity
@Table(name = "tables")
public class TableC {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "table_id")
    private long tableId;

    @Column(name = "table_number")
    private Integer tableNumber;

    @Column(name = "assigned")
    private boolean tableStatus;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

    @OneToMany (mappedBy = "table")
    private  Set<Order> orderSet;

    public TableC() {
    }

    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(boolean tableStatus) {
        this.tableStatus = tableStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
package am.sfl.cafemanager.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


/**
 * Simple JavaBean Object that represents Table status.
 *
 * Created by David Karchikyan on 8/7/2017.
 */

@Entity
@javax.persistence.Table (name = "tables")
public class Table {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;

    @Column (name = "table_number")
    private Integer tableNumber;

    @Column (name = "assigned")
    private boolean tableStatus;

    @ManyToOne
    @JoinTable (name = "waiter_table", joinColumns = @JoinColumn(name = "table_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> userList;

    @OneToOne (mappedBy = "tables")
    private List <Order> orderList;

    public Table() {
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isAssigned() {
        return tableStatus;
    }

    public void setAssigned(boolean tableStatus) {
        this.tableStatus = tableStatus;
    }

    public Set<User> getUserList() {
        return userList;
    }

    public void setUserList(Set<User> userList) {
        this.userList = userList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}

package am.sfl.cafemanager.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Simple JavaBean Object that represents Order status;
 *
 * Created by David Karchikyan on 8/7/2017.
 */

@Entity
@javax.persistence.Table (name = "orders")
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;

    @Column (name = "order_number")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer orderNumber;

    @Column (name = "order_status")
    private Boolean orderStatus;

    @OneToOne (mappedBy = "orders")
    private List<Table> tableList;

    @OneToMany
    @JoinTable (name = "product_in_order", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn (name = "product_id"))
    Map <Order, List<Product>> orderListMap;


    public Order() {
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Table> getTableList() {
        return tableList;
    }

    public void setTableList(List<Table> tableList) {
        this.tableList = tableList;
    }

    public Map<Order, List<Product>> getOrderListMap() {
        return orderListMap;
    }

    public void setOrderListMap(Map<Order, List<Product>> orderListMap) {
        this.orderListMap = orderListMap;
    }
}

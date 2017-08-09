package am.sfl.cafemanager.model;

import javax.persistence.*;
import java.util.List;

/**
 * Simple JavaBean Object that represents Order status;
 *
 * Created by David Karchikyan on 8/7/2017.
 */

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;

    @Column(name = "order_number")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer orderNumber;

    @Column(name = "order_status")
    private Boolean orderStatus;

    @Column(name = "total_amount")
    private Double totalAmount;

    @ManyToOne
    @JoinColumn (name = "table_id")
    private TableC table;

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

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public TableC getTable() {
        return table;
    }

    public void setTable(TableC table) {
        this.table = table;
    }

}

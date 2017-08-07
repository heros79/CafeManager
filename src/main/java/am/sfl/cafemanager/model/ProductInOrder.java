package am.sfl.cafemanager.model;

import javax.persistence.*;

/**
 * Simple JavaBean Object that represents Products quantity in Order.
 *
 * Created by David Karchikyan on 8/7/2017.
 */

@Entity
@javax.persistence.Table (name = "product_in_order")
public class ProductInOrder {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;

    @Column
    private Integer quantity;

    @Column
    private Double totalPrice;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

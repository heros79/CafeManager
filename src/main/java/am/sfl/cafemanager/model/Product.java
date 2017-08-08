package am.sfl.cafemanager.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Simple JavaBean Object that represents Products (name, description and other).
 *
 * Created by David Karchikyan on 8/7/2017.
 */

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_price")
    private Double productPrice;

    @ManyToMany
    @JoinTable(name = "products_in_table", joinColumns = @JoinColumn (name = "product_id"), inverseJoinColumns = @JoinColumn(name = "order_id"))
    Set<Order> orderSet;

    public Product() {
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }
}

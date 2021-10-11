package com.p3.farmersbay.farmersbayapi.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Orders")
public class Order implements Serializable {
	private static final long serialVersionUID = 132432423L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "productId")
    private Product product;
    private int quantity;
    private double totalAmount;
    private String orderStatus;
    private String deliveryAddress;

    public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}

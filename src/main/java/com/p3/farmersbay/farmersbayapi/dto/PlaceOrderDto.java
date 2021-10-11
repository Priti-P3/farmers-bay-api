package com.p3.farmersbay.farmersbayapi.dto;

import java.io.Serializable;

public class PlaceOrderDto implements Serializable {

	private static final long serialVersionUID = 342342342L;
	
	private Long productId;
	private Integer quantity;
	private String billingAddress;
	private String billingName;
	private Long billingContactNo;
	private String billingEmailAddress;
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getBillingName() {
		return billingName;
	}
	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}
	public Long getBillingContactNo() {
		return billingContactNo;
	}
	public void setBillingContactNo(Long billingContactNo) {
		this.billingContactNo = billingContactNo;
	}
	public String getBillingEmailAddress() {
		return billingEmailAddress;
	}
	public void setBillingEmailAddress(String billingEmailAddress) {
		this.billingEmailAddress = billingEmailAddress;
	}
	
}

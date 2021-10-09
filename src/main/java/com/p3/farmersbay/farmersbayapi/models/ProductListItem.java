package com.p3.farmersbay.farmersbayapi.models;

public class ProductListItem {
    private long id;
    private String productName;
    private String productShortDesc;
    private String productImage;
    private boolean enabled;
    private boolean available;

    public ProductListItem() {
    }

    public ProductListItem(String productName, String productShortDesc, String productImage, boolean enabled, boolean available) {
        this.productName = productName;
        this.productShortDesc = productShortDesc;
        this.productImage = productImage;
        this.enabled = enabled;
        this.available = available;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductShortDesc() {
        return productShortDesc;
    }

    public void setProductShortDesc(String productShortDesc) {
        this.productShortDesc = productShortDesc;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

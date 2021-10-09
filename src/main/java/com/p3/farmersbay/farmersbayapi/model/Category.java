package com.p3.farmersbay.farmersbayapi.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable {
	private static final long serialVersionUID = 1343434L;
	@Id
    @GeneratedValue
    private long categoryId;
    private String categoryName;
    private String description;
    private boolean enabled;
    private String iconPath;

	public Category() {
    }

    public Category(String categoryName, String description, boolean enabled, String iconPath) {
        this.categoryName = categoryName;
        this.description = description;
        this.enabled = enabled;
        this.iconPath = iconPath;
    }

    public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }
}

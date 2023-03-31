package com.wishlist.wishlistminiprojekt.DTO;

import java.util.Date;

public class WishlistItemDTO {
    private int id;
    private int wishListId;
    private String name;
    private float price;
    private String description;
    private String url;
    private Date createdAt;

    public WishlistItemDTO(int id, int wishListId, String name, float price, String description, String url, Date createdAt) {
        this.id = id;
        this.wishListId = wishListId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.url = url;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWishListId() {
        return wishListId;
    }

    public void setWishListId(int wishListId) {
        this.wishListId = wishListId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

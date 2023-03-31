package com.wishlist.wishlistminiprojekt.DTO;

import java.util.Date;

public class WishlistDTO {
    private int id;
    private int userId;
    private String title;
    private String description;
    private Date createdAt;

    public WishlistDTO(int id, int userID, String title, String description, Date createdAt) {
        this.id = id;
        this.userId = userID;
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

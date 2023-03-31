package com.wishlist.wishlistminiprojekt.Repositories;

import com.wishlist.wishlistminiprojekt.DTO.UserDTO;

import java.util.List;

public interface IWishlistRepository {
    List<UserDTO> getUserInfo();
}

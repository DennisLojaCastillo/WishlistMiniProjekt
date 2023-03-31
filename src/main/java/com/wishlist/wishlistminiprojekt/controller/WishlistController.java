package com.wishlist.wishlistminiprojekt.controller;

import com.wishlist.wishlistminiprojekt.DTO.UserDTO;
import com.wishlist.wishlistminiprojekt.Repositories.IWishlistRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/wishlist")
@Controller
public class WishlistController {
    IWishlistRepository iWishlistRepository;

    public WishlistController(ApplicationContext context, @Value("${wishlist.repository.impl}") String impl) {
        iWishlistRepository = (IWishlistRepository) context.getBean(impl);
    }

    @GetMapping(path = ("/all"))
    public String getUserInformation(Model model) {
        List<UserDTO> userList = iWishlistRepository.getUserInfo();
        model.addAttribute("userList", userList);
        return "index";
    }
}


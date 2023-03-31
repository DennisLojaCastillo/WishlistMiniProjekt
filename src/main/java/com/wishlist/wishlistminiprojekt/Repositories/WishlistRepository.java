package com.wishlist.wishlistminiprojekt.Repositories;

import com.wishlist.wishlistminiprojekt.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository("wishlist_Database")
public class WishlistRepository implements IWishlistRepository {
    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String user;
    @Value("${spring.datasource.password}")
    String pwd;

    public List<UserDTO> getUserInfo() {
        List<UserDTO> userList = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url,user,pwd)){
            String SQL = "SELECT * FROM user";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                userList.add(new UserDTO(
                        rs.getInt("userID"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email")));
            }
            return userList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

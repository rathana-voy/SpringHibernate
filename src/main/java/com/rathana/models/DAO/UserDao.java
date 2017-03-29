package com.rathana.models.DAO;

import com.rathana.models.User;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by RATHANA on 18-Feb-17.
 */


public interface UserDao extends Repository<User, Integer> {

    public List<User> findAll();
    public User findByUserId(int userId);


}

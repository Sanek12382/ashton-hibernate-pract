package com.sanek12382.service.serviceInterfaces;

import com.sanek12382.entity.EntityBase;
import com.sanek12382.entity.User;

import java.util.List;

public interface UserServiceInterface {
    public List<User> getAll();
    public User getOne(int id);
    void deleteOne(User user);


    //не понял можно ли вообще подменить EntityBase в имплементации...
    //на класс имплементирующий его по этому оставил как есть.
    public void updateOne(User entity);
    public void insertOne(User entity);
}

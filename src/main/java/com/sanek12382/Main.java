package com.sanek12382;

import com.sanek12382.entity.User;
import com.sanek12382.service.UserService;

public class Main {
    public static void main(String[] args) {
        User user= new User(1, "cooldDude",null,null,null);
        UserService service=new UserService();
        service.insertOne(user);


    }
}
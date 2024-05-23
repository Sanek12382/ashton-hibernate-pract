package com.sanek12382.service.serviceInterfaces;

import com.sanek12382.entity.EntityBase;
import com.sanek12382.entity.Groupchat;
import com.sanek12382.entity.Post;

import java.util.List;

public interface GroupChatServiceInterface {
    public List<Groupchat> getAll();
    public Groupchat getOne(int id);
    public void deleteOne(Groupchat groupchat);

    //не понял можно ли вообще подменить EntityBase в имплементации...
    //на класс имплементирующий его по этому оставил как есть.
    public void updateOne(Groupchat entity);
    public void insertOne(Groupchat entity);
}

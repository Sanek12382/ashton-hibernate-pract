package com.sanek12382.service.serviceInterfaces;

import com.sanek12382.entity.EntityBase;
import com.sanek12382.entity.Post;
import com.sanek12382.entity.User;

import java.util.List;

public interface PostServiceInterface {
    public List<Post> getAll();
    public Post getOne(int id);
    public void deleteOne(Post post);

    //не понял можно ли вообще подменить EntityBase в имплементации...
    //на класс имплементирующий его по этому оставил как есть.
    public void updateOne(Post entity);
    public void insertOne(Post entity);
}

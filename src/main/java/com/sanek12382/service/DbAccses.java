package com.sanek12382.service;

import com.sanek12382.entity.EntityBase;

import java.util.List;

public interface DbAccses {
    public List<EntityBase> getAll();
    public EntityBase getOne(int id);
    public boolean deleteOne(int id);
    public boolean deleteMany(int[] ids);
    //не понял можно ли вообще подменить EntityBase в имплементации...
    //на класс имплементирующий его по этому оставил как есть.
    public boolean updateOne(EntityBase entity);
    public boolean insertOne(EntityBase entity);
}

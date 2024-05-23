package com.sanek12382.service.serviceInterfaces;

import com.sanek12382.entity.EntityBase;
import com.sanek12382.entity.PersonalPage;
import com.sanek12382.entity.Post;

import java.util.List;

public interface PersonalPageServiceInterface {
    public List<PersonalPage> getAll();
    public PersonalPage getOne(int id);
    public void deleteOne(PersonalPage page);

    //не понял можно ли вообще подменить EntityBase в имплементации...
    //на класс имплементирующий его по этому оставил как есть.
    public void updateOne(PersonalPage entity);
    public void insertOne(PersonalPage entity);
}

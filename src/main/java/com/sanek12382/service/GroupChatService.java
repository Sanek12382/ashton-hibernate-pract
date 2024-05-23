package com.sanek12382.service;

import com.sanek12382.HibernateUtil;
import com.sanek12382.entity.EntityBase;
import com.sanek12382.entity.Groupchat;
import com.sanek12382.entity.PersonalPage;
import com.sanek12382.entity.Post;
import com.sanek12382.service.serviceInterfaces.GroupChatServiceInterface;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class GroupChatService  implements GroupChatServiceInterface {
    @Override
    public List<Groupchat> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("SELECT * FROM users", Groupchat.class).getResultList();
    }

    @Override
    public Groupchat getOne(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Groupchat entity=session.get(Groupchat.class, id);
        transaction.commit();
        session.close();
        return entity;
    }

    @Override
    public void deleteOne(Groupchat groupchat) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(groupchat);
        transaction.commit();
        session.close();
    }



    @Override
    public void updateOne(Groupchat entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public void insertOne(Groupchat entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(entity);
        transaction.commit();
        session.close();
    }
}

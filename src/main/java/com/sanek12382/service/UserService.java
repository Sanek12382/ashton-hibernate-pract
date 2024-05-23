package com.sanek12382.service;

import com.sanek12382.HibernateUtil;
import com.sanek12382.entity.Post;
import com.sanek12382.entity.User;
import com.sanek12382.service.serviceInterfaces.UserServiceInterface;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class UserService  implements UserServiceInterface {
    @Override
    public List<User> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("SELECT * FROM users", User.class).getResultList();
    }

    @Override
    public User getOne(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        User entity=session.get(User.class, id);
        transaction.commit();
        session.close();
        return entity;
    }

    @Override
    public void deleteOne(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(user);
        transaction.commit();
        session.close();
    }


    @Override
    public void updateOne(User entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(entity);
        transaction.commit();
        session.close();

    }

    @Override
    public void insertOne(User entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(entity);
        transaction.commit();
        session.close();
    }
}

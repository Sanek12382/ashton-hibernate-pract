package com.sanek12382.service;

import com.sanek12382.HibernateUtil;
import com.sanek12382.entity.EntityBase;
import com.sanek12382.entity.PersonalPage;
import com.sanek12382.entity.Post;
import com.sanek12382.entity.User;
import com.sanek12382.service.serviceInterfaces.PersonalPageServiceInterface;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PersonalPageService implements PersonalPageServiceInterface {
    @Override
    public List<PersonalPage> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("SELECT * FROM users", PersonalPage.class).getResultList();
    }

    @Override
    public PersonalPage getOne(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        PersonalPage entity=session.get(PersonalPage.class, id);
        transaction.commit();
        session.close();
        return entity;
    }

    @Override
    public void deleteOne(PersonalPage page) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(page);
        transaction.commit();
        session.close();
    }


    @Override
    public void updateOne(PersonalPage entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public void insertOne(PersonalPage entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(entity);
        transaction.commit();
        session.close();
    }
}

package com.sanek12382.service;

import com.sanek12382.HibernateUtil;
import com.sanek12382.entity.EntityBase;
import com.sanek12382.entity.Post;
import com.sanek12382.entity.User;
import com.sanek12382.service.serviceInterfaces.PostServiceInterface;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PostService  implements PostServiceInterface {
    @Override
    public List<Post> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("SELECT * FROM posts", Post.class).getResultList();
    }

    @Override
    public Post getOne(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Post entity=session.get(Post.class, id);
        transaction.commit();
        session.close();
        return entity;
    }

    @Override
    public void deleteOne(Post post) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(post);
        transaction.commit();
        session.close();
    }


    @Override
    public void updateOne(Post entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public void insertOne(Post entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(entity);
        transaction.commit();
        session.close();
    }
}

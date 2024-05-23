package com.sanek12382;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;


public class HibernateUtil {

    private static final SessionFactory sessionFactory= initSessionFactory();

    private static SessionFactory initSessionFactory(){
            try {
                return new Configuration().configure(new File("src\\main\\resources\\hibernate.cfg.xml")).buildSessionFactory();
            }
            catch (Throwable exx){
                System.err.println("Failed to construct SessionFactory" + exx);
                throw new ExceptionInInitializerError();}


    }

    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null){initSessionFactory();}
        return sessionFactory;
    }

    public static void closeSession(){
        getSessionFactory().close();
    }
}

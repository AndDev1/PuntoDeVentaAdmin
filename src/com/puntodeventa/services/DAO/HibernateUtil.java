package com.puntodeventa.services.DAO;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author hhehs910
 */
public class HibernateUtil {

    private static Connection con = null;
    private static final SessionFactory sessionFactory;
    private Session session;
    private Transaction tx;
    
    static {
        try {        
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (HibernateException he) {            
            System.err.println("Initial SessionFactory creation failed." + he);
            throw new ExceptionInInitializerError(he);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
        
}

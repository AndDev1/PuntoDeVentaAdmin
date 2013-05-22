/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntodeventa.services.DAO;

import java.sql.Connection;
import org.hibernate.Session;

/**
 *
 * @author Nato Hdez
 */
public class ConnectedByHibernate {
    private Session session;
    
    public Connection getConectionJDBC() {
        Connection con;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            con = session.connection();
            return con;
        } catch (Exception ex) {
            con = null;
            return con;
        }
    }
}

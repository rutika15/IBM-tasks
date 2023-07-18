package org.ibm.newconcept;



import org.ibm.newconcept.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App1 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(InternationalCD.class).addAnnotatedClass(SpecialCD.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        InternationalCD iCd=new InternationalCD("Name-A","French");
        SpecialCD sCD=new SpecialCD("Name-B","3D");
        session.getTransaction().begin();
        session.save(iCd);
        session.save(sCD);
        session.getTransaction().commit();
        System.out.println("done");
    }
}
package Hibernate;

import Models.Product;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Ivan on 27.07.2016.
 */
public class Main {
    public static void main(String... args){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Product> products = new ArrayList<Product>();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from Product as p where p.id = 1");
            products = query.list();

            //Criteria criteria = session.createCriteria(Product.class);
            //products = criteria.list();
            Object object = new Object();
            Object object1 = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            session.getTransaction().commit();
        }
        finally {
            session.close();
        }

        for(Product product: products){
            System.out.println(product.toString());
        }
    }
}

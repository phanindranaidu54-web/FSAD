package com.inventory.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.inventory.entity.Product;
import com.inventory.util.HibernateUtil;

public class ProductCrudDemo {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product p1 = new Product("Tablet", "Android Tablet", 18000, 12);
        session.save(p1);
        System.out.println("Product inserted");

        /* ---------- READ ---------- */
        Product fetched = session.get(Product.class, p1.getId());
        if (fetched != null) {
            System.out.println("Fetched Product: " + fetched.getName());
        }

        fetched.setPrice(17000);
        fetched.setQuantity(10);
        session.merge(fetched);
        System.out.println("Product updated");

        session.remove(fetched);
        System.out.println("Product deleted");

        
        
        //new code
//        Transaction tx1 = null;
//        try (Session session1 = HibernateUtil.getSessionFactory().openSession()) {
//            tx1 = session1.beginTransaction();

            session.persist(new Product("Pen", "Stationery",10.0, 100));
            session.persist(new Product("Notebook", "Stationery", 60.0, 40));
            session.persist(new Product("Mouse", "Electronics", 499.0, 15));
            session.persist(new Product("Keyboard", "Electronics", 899.0, 10));
            session.persist(new Product("Bottle", "Home", 199.0, 0));
            session.persist(new Product("Bag", "Travel", 999.0, 7));
            session.persist(new Product("Charger", "Electronics", 799.0, 20));

           
            tx.commit();
            session.close();
//        } catch (Exception e) {
//            if (tx1 != null) tx1.rollback();
//            e.printStackTrace();
//        }
    }
}

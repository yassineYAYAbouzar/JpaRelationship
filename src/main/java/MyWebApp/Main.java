package MyWebApp;

import MyWebApp.util.JPAutil;
import jakarta.persistence.EntityManager;


public class Main {

    public static void main(String[] args) {

        //uni directional
        EntityManager em = JPAutil.entityManagerFactory().createEntityManager();
        em.getTransaction().begin();

        em.getTransaction().commit();
        em.close();

    }
}

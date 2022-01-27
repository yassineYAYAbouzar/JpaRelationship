package MyWebApp.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAutil {
    public static EntityManagerFactory entityManagerFactory(){
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        return entityManagerFactory;
    }


}
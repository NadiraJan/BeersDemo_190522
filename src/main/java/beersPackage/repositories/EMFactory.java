package beersPackage.repositories;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class EMFactory {

    public static EntityManagerFactory getEMF() {

        return createEntityManagerFactory("nadiraDataBase");
    }


}


package beersPackage;

/*import beerPackage.data.Beers;
import beerPackage.data.SuperHero;
import beerPackage.data.SuperVillain;
import beerPackage.repositories.BeersRepository;*/
import beersPackage.data.SuperHero;
import beersPackage.data.SuperVillain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BeerApp {
    public static void main(String[] args) {

   /*     EntityManagerFactory emf = Persistence.createEntityManagerFactory("nadiraDataBase");
        EntityManager em = emf.createEntityManager();

    SuperHero superman = new SuperHero("Batman", "Money");
     SuperVillain lexLuthor = new SuperVillain("Dr.Robotnik", "SuperRIch");

     em.getTransaction().begin();
      em.persist(lexLuthor);
     em.getTransaction().commit();

    Query query = em.createQuery("Select v from SuperVillain v");
        List<SuperVillain> list = query.getResultList();
        for (SuperVillain sv: list){
            System.out.println(sv);
        }*/

//        SuperVillain superVillain = em.find(SuperVillain.class,1);
//
//       em.getTransaction().begin();
//
//     em.remove(superVillain);
//       em.getTransaction().commit();

    }
}

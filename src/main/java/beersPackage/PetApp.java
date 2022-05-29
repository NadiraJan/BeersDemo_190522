package beersPackage;

import beersPackage.data.Dog;
import beersPackage.data.Owner;
import beersPackage.repositories.EMFactory;
import javax.persistence.EntityManager;

public class PetApp {
    public static void main(String[] args) {

        EntityManager em = EMFactory.getEMF().createEntityManager();
        Owner owner = em.find(Owner.class, 1);
       // Dog dog = new Dog("Scooby Doo", owner);




      /*em.getTransaction().begin();
        em.persist(owner);
        em.getTransaction().commit();*/

        System.out.println(owner.getDog());


    }
}

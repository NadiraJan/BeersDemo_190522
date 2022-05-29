package beersPackage;

import beersPackage.data.Dog;
import beersPackage.data.Owner;
import beersPackage.repositories.EMFactory;

import javax.persistence.EntityManager;

public class PetApp {
    public static void main(String[] args) {
        Dog dog;
        EntityManager em = EMFactory.getEMF().createEntityManager();
        //Owner owner = new Owner(1, "Tintin");

        dog = em.find(Dog.class, 1);
       // Dog dog = new Dog(1, "Bobbie", owner);


     /*   em.getTransaction().begin();
        em.persist(dog);
        em.getTransaction().commit();*/
        System.out.println(dog.getOwnerThatOwnsDog());


    }
}

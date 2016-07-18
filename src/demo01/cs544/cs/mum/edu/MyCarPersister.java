package demo01.cs544.cs.mum.edu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Somayeh
 */
public class MyCarPersister {

    private EntityManagerFactory emf;
    private EntityManager em;

    public MyCarPersister() {
        emf = Persistence.createEntityManagerFactory("Demo01_Entities");
        em = emf.createEntityManager();
    }

    public void start() {
        if (emf != null) {
            end();
        }
        emf = Persistence.createEntityManagerFactory("Demo01_Entities");
        em = emf.createEntityManager();
    }

    public void end() {
        if (emf != null) {
            em.close();
            emf.close();
            emf = null;
        }
    }

    public void save(Car car) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(car);
        tx.commit();
    }

    public static void main(String[] args) {
        Car somayehCar = new Car("Aston-Martin", "V8-Vantage",2015,5000,ColorEnum.Green);
         
        MyCarPersister persister = new MyCarPersister();
        persister.save(somayehCar);
        persister.end();
    }

}

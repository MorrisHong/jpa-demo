package ch08.CASCADE;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();

        saveWithCascade(em);
    }

    private static void saveWithCascade(EntityManager em) {
        em.getTransaction().begin();
        //부모저장
        Parent parent = new Parent();
        //자식1 저장
        Child child1 = new Child();
        parent.getChildren().add(child1);
        child1.setParent(parent);
        //자식2 저장.
        Child child2 = new Child();
        parent.getChildren().add(child2);
        child2.setParent(parent);


        em.persist(parent);

        em.getTransaction().commit();
    }
}

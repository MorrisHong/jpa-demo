package ch05;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Team team1 = new Team("team1", "팀1");
            em.persist(team1);

            Member member1 = new Member("member1", "회원1");
            em.persist(member1);
            member1.setTeam(team1);

            Member member2 = new Member("member2", "회원2");
            em.persist(member2);
            member2.setTeam(team1);

            Team findTeam = member1.getTeam();

            System.out.println(findTeam.getName());

            tx.commit();
        }catch (Exception e) {
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();

    }
}

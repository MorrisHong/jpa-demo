package start;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;


public class JpaMain {
    public static void main(String[] args) {
        //META-INF/persistance.xml의 유닛 이름을 인자로 넘겨준다.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            /**
             * 비즈니스로직
             */
//            logic(em);
            testDetached(em);
            tx.commit();
        }catch (Exception e) {
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }

    private static void logic(EntityManager em) {
        String id = "id1";
        Member member = new Member();
        member.setId(id);
        member.setUsername("gracelove");
        member.setAge(30);

        //등록
        em.persist(member);

        //수정
        member.setAge(20);

        //한건조회
        Member findMember = em.find(Member.class, id);
        System.out.println("findMemberName = " + findMember.getUsername());
        System.out.println("findMemberAge = " + findMember.getAge());

        //목록조회
        List<Member> members = em.createQuery("select m from Member as m", Member.class)
                .getResultList();
        System.out.println("members.size = " + members.size());

        //삭제
        em.remove(member);
    }

    public static void testDetached(EntityManager em) {
        Member member = new Member();
        member.setId("memberA");
        member.setUsername("Geumbo");

        em.persist(member);

        em.detach(member);

        em.getTransaction().commit();
    }
}

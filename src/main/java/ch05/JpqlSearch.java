package ch05;

import javax.persistence.EntityManager;
import java.util.List;

public class JpqlSearch {

    public void queryLogicJoin(EntityManager em) {
        String jpql = "select m from Member as m join m.team t where "+
                "t.name=:teamName";

        List<Member> members = em.createQuery(jpql, Member.class)
                .setParameter("teamName", "팀1")
                .getResultList();

        for(Member m : members) {
            System.out.println("[query] member.username = " + m.getUsername());
        }
    }
}

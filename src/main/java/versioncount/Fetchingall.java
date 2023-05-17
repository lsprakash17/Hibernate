package versioncount;

import java.awt.geom.QuadCurve2D;
import java.util.List;

import javax.persistence.*;

public class Fetchingall
{
public static void main(String[] args) {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Query q=m.createQuery("select a from Hibernate a");
	List<detail>  d=q.getResultList();
	for(detail f:d)
	{
		System.out.println(f.getId());
		System.out.println(f.getName());
		System.out.println(f.getItime());
		System.out.println(f.getuTime());
		System.out.println(f.getCount());
	}
}
}

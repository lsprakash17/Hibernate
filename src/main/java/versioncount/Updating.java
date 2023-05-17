package versioncount;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updating 
{
public static void main(String[] args) {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	detail d=m.find(detail.class, 1);
	d.setName("Lo");
	t.begin();
	m.merge(d);
	t.commit();
}
}

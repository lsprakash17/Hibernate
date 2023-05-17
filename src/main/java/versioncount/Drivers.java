package versioncount;

import javax.persistence.*;

public class Drivers 
{
public static void main(String[] args) {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	detail d=new detail();
	d.setName("prakash");
	t.begin();
	m.persist(d);
	t.commit();
	
}
}

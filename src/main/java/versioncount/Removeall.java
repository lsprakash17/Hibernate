package versioncount;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.border.EtchedBorder;

public class Removeall 
{
public static void main(String[] args) {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Query q=m.createQuery("delete from Hibernate");
	t.begin();
	q.executeUpdate();
	t.commit();
}
}

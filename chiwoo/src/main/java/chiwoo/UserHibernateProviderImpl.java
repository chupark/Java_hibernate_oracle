package chiwoo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserHibernateProviderImpl implements UserProvider{

	public void insertUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(user);
		
		tx.commit();
		session.close();
	}

	public List<User> findAllUsers() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		List<User> users = session.createQuery("from User u order by u.name asc").list();
		
		tx.commit();
		session.close();
		
		return users;
	}

	public User findUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateUser(String userId, String updateName) {
		// TODO Auto-generated method stub
		return null;
	}

}

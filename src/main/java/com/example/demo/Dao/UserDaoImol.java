package com.example.demo.Dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Entities.User;

@Transactional
@Component
public class UserDaoImol implements UserDao{


	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void InsertUser(User user) {

        Session session = sessionFactory.openSession();
     Transaction transaction = session.beginTransaction();
     
	 session.save(user);
        
		
		transaction.commit();
		
        session.flush(); 
		
	}

	@Override
	public User SelectUser(String id) {
		
	    Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User  user= (User) session.createCriteria(User.class).add(Restrictions.eq("id", id)).uniqueResult();
        transaction.commit();
        session.flush(); //address will not get saved without this
        return user;

	}

	@Override
	public void DeleteUser(String id) {
		
      Session session = sessionFactory.openSession();
      Transaction transaction = session.beginTransaction();

      Query query = session.createQuery("delete from User where id:=id");
      query.setParameter("id", id);
      query.executeUpdate();
      transaction.commit();

      session.flush(); //address will not get saved without this

	}

	@Override
	public void UpdateUer(User user) {
		// TODO Auto-generated method stub
		
	    Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();

        session.flush(); //address will not get saved without this

	}

}

package com.jayprints.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jayprints.dbEntity.Customer;


@Repository
public class CustDaoImpl implements CustDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomerDetails() {

		// this method will get the customer details from table
		
		Session s = sessionFactory.getCurrentSession();
		
		Query<Customer> query = s.createQuery("from Customer",Customer.class);
				
		List<Customer> lstCust = query.getResultList();
		
		return lstCust;
	}
	
	
	
}

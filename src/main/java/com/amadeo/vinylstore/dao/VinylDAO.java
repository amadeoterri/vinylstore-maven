package com.amadeo.vinylstore.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amadeo.vinylstore.Entity.Vinyl;

@Repository
public class VinylDAO implements IVinylDAO {

	// inject session factory
	@Autowired
	private SessionFactory sessionFactory;

	public List<Vinyl> getVinyls() {

		// make list
		List<Vinyl> vinyls = new ArrayList<Vinyl>();

		// get session
		Session session = sessionFactory.getCurrentSession();

		// Create query
		Query<Vinyl> query = session.createQuery("FROM Vinyl ORDER BY artist", Vinyl.class);

		// execute query and get result
		vinyls = query.getResultList();

		// return list
		return vinyls;

	}

}

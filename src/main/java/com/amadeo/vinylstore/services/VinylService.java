package com.amadeo.vinylstore.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amadeo.vinylstore.Entity.Vinyl;
import com.amadeo.vinylstore.dao.IVinylDAO;

@Service
public class VinylService implements IVinylService {

	// inject vinyldao
	@Autowired
	private IVinylDAO vinylDAO;

	@Transactional
	public List<Vinyl> getVinyls() {

		return vinylDAO.getVinyls();
	}
}

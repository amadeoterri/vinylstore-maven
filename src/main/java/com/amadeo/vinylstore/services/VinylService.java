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
	private IVinylDAO _vinylDAO;

	@Transactional
	public List<Vinyl> getVinyls() {

		return _vinylDAO.getVinyls();
	}

	@Transactional
	public void saveVinyl(Vinyl vinyl) {

		_vinylDAO.saveVinyl(vinyl);

	}

	@Transactional
	public Vinyl getVinyl(int id) {

		return _vinylDAO.getVinyl(id);
	}

	@Transactional
	public void deleteVinyl(int id) {

		_vinylDAO.deleteVinyl(id);
	}
}

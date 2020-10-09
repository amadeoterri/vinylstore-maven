package com.amadeo.vinylstore.dao;

import java.util.List;

import com.amadeo.vinylstore.Entity.Vinyl;

public interface IVinylDAO {

	public List<Vinyl> getVinyls();

	public void saveVinyl(Vinyl vinyl);

	public Vinyl getVinyl(int id);

	public void deleteVinyl(int id);

}

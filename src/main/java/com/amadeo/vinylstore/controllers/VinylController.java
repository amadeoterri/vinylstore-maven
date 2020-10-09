package com.amadeo.vinylstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amadeo.vinylstore.Entity.Vinyl;
import com.amadeo.vinylstore.services.IVinylService;

@Controller
@RequestMapping("/vinyl")
public class VinylController {

	// inject services
	@Autowired
	private IVinylService vinylService;

	@GetMapping("/list")
	public String showAllVinyls(Model model) {

		// get vinyls from service
		List<Vinyl> vinyls = vinylService.getVinyls();

		// add vinyls to the model
		model.addAttribute("vinyls", vinyls);

		for (Vinyl v : vinyls) {
			System.out.println(v);
		}

		return "list-vinyls";

	}

}

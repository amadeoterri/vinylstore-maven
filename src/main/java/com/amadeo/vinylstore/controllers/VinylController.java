package com.amadeo.vinylstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amadeo.vinylstore.Entity.Vinyl;
import com.amadeo.vinylstore.services.IVinylService;

@Controller
@RequestMapping("/vinyl")
public class VinylController {

	// inject services
	@Autowired
	private IVinylService _vinylService;

	@GetMapping("/list")
	public String showAllVinyls(Model model) {

		// get vinyls from service
		List<Vinyl> vinyls = _vinylService.getVinyls();

		// add vinyls to the model
		model.addAttribute("vinyls", vinyls);

		return "list-vinyls";

	}

	@GetMapping("/showFormForAdd")
	public String addVinyl(Model model) {

		// create model attribute to bind form data
		Vinyl vinyl = new Vinyl();

		model.addAttribute("vinyl", vinyl);

		return "form-vinyl";
	}

	@PostMapping("/saveVinyl")
	public String saveVinyl(@ModelAttribute("vinyl") Vinyl vinyl) {

		_vinylService.saveVinyl(vinyl);

		return "redirect:/vinyl/list";
	}

	@GetMapping("/showFormForUpdate")
	public String updateVinyl(@RequestParam("vinylId") int id, Model model) {

		Vinyl vinyl = _vinylService.getVinyl(id);

		model.addAttribute("vinyl", vinyl);

		return "form-vinyl";

	}

	@GetMapping("/delete")
	public String deleteVinyl(@RequestParam("vinylId") int id) {

		_vinylService.deleteVinyl(id);

		return "redirect:/vinyl/list";

	}

}

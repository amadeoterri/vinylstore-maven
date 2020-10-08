package com.amadeo.vinylstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vinyl")
public class VinylController {

	@GetMapping("/list")
	public String showAllVinyls() {
		return "list-vinyls";
	}

}

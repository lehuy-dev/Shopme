package com.shopme.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControler {

	@GetMapping(name = "/")
	public String name() {
		return "index";
	}
}

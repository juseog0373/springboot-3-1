package com.office.library.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class AdminHomeController {
	@RequestMapping(value = {"/admin"}, method = GET)
	public String home() {
		System.out.println("[AdminHomeController] home()");
  		return "admin/home";
	}
}
package com.policyholder.landing;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		//model.put("message", this.message);
		return "home";
	}
	@RequestMapping("/admin")
	public String admin() {
		//model.put("message", this.message);
		return "admin";
	}
}